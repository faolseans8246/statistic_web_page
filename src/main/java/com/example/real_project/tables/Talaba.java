package com.example.real_project.tables;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "talaba")
public class Talaba{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private long id;

    @Column(unique = false)
    private String lastname;

    @Column(unique = false)
    private String firstname;

    @Column(unique = false)
    private int days;

    @Column(unique = false)
    private String months;

    @Column(unique = false)
    private int years;

    @Column(unique = false)
    private int groups;

    @Column(unique = false)
    private String faculty;

    @Column(unique = false)
    private String address;

    @Column(unique = false)
    private double score;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getMonths() {
        return months;
    }

    public void setMonths(String months) {
        this.months = months;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getGroups() {
        return groups;
    }

    public void setGroup(int groups) {
        this.groups = groups;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
