package com.company;

public class Staffs {
    private String employeeName;
    private String employeeId;
    private int yearsOfExperience;
    private String employeeQualification;
    private String workRate;
    private boolean markAttendance;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getEmployeeQualification() {
        return employeeQualification;
    }

    public void setEmployeeQualification(String employeeQualification) {
        this.employeeQualification = employeeQualification;
    }

    public String getWorkRate() {
        return workRate;
    }

    public void setWorkRate(String workRate) {
        this.workRate = workRate;
    }

    public boolean isMarkAttendance() {
        return markAttendance;
    }

    public void setMarkAttendance(boolean markAttendance) {
        this.markAttendance = markAttendance;
    }

    public Staffs(String employeeName, String employeeId, int yearsOfExperience, String employeeQualification, String workRate, boolean markAttendance) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.yearsOfExperience = yearsOfExperience;
        this.employeeQualification = employeeQualification;
        this.workRate = workRate;
        this.markAttendance = markAttendance;
    }
}