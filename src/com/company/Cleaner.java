package com.company;

public class Cleaner extends Staffs{
    public Cleaner(String employeeName, String employeeId, int yearsOfExperience, String employeeQualification, String workRate, boolean markAttendance) {
        super(employeeName, employeeId, yearsOfExperience, employeeQualification, workRate, markAttendance);
    }
public void cleaning (Cleaner cleaner) {
    System.out.println(cleaner.getEmployeeName() + " keeps the environment clean");
}
}
