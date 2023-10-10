package com.example.real_project.services;

import com.example.real_project.tables.Talaba;

import java.util.List;

public interface MainService {

    public List<Talaba> getAllStudents();

    public void saves(Talaba talaba);

    public void deleteStudent(long ids);

    public Talaba getTalabaById(long ids);
}
