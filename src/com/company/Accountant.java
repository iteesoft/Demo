package com.company;

public class Accountant extends Staffs {
    public Accountant(String employeeName, String employeeId, int yearsOfExperience, String employeeQualification, String workRate, boolean markAttendance) {
        super(employeeName, employeeId, yearsOfExperience, employeeQualification, workRate, markAttendance);
    }
 public void paySalary(Staffs staffs) {
     System.out.println(staffs.getEmployeeName() + " will be paid today.");
 }
}
daJAVA