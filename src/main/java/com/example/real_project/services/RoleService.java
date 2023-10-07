package com.example.real_project.services;

import com.example.real_project.repository.TalabaRepository;
import com.example.real_project.tables.Talaba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements MainService{

    @Autowired
    private TalabaRepository talabaRepository;

    @Override
    public List<Talaba> getAllStudents() {
        return talabaRepository.findAll();
    }


    @Override
    public void saves(Talaba talaba) {
        talabaRepository.save(talaba);
    }

}
