package com.example.real_project.controller;


import com.example.real_project.services.MainService;
import com.example.real_project.tables.Talaba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TalabaController {

    @Autowired
    private MainService mainService;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("talabaObj", mainService.getAllStudents());

        return "my_home";
    }


    @GetMapping("/additionPage")
    public String goToPage(Model model) {
        Talaba talaba = new Talaba();
        model.addAttribute("student", talaba);

        return "add_student";
    }


    @PostMapping("/saveTalaba")
    public String saveStudents(@ModelAttribute("student") Talaba talaba) {
        mainService.saves(talaba);

        return "redirect:/";
    }

    @GetMapping("/deleteStudent/{ids}")
    public String deleteStudentById(@PathVariable(value = "ids") long ids) {
        this.mainService.deleteStudent(ids);
        return "redirect:/";
    }

    @GetMapping("/updateStudent/{ids}")
    public String updateTalaba(@PathVariable(value = "ids") long ids, Model model) {
        Talaba talabaId = mainService.getTalabaById(ids);

        model.addAttribute("talaba", talabaId);
        return "talaba_update";
    }



}
