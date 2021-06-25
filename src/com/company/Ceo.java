package com.company;

public class Ceo {
    private String name;
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Ceo(String name, String title) {
        this.name = name;
        this.title = title;
    }
    static void hire(Applicant applicant) {
        if (applicant.getQualification().equalsIgnoreCase("Bsc")) {
            System.out.println(applicant.getApplicantName() + " is Hired");
        }
    }
    static void fire(Staffs staffs) {
        if (staffs.getWorkRate().equalsIgnoreCase("low")) {
            System.out.println(staffs.getEmployeeName() + " is fired");
        }
    }
    static void giveRaise(Staffs staffs) {
        if (staffs.getWorkRate().equalsIgnoreCase("low")) {
            System.out.println(staffs.getEmployeeName() + " gets a 2% reduction");
        } else if (staffs.getWorkRate().equalsIgnoreCase("average")) {
            System.out.println(staffs.getEmployeeName() + " keep up the good work. you are doing well");
        } else if (staffs.getWorkRate().equalsIgnoreCase("high")) {
            System.out.println(staffs.getEmployeeName() + " gets a raise of 10% and a two days leave");
        }
    }

    }