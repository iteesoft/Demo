package com.company;

public class Main {

    public static void main(String[] args) {
        Ceo Melvin = new Ceo("Melvin", "Chief Executive Officer");
        Applicant Jane= new Applicant("Jane", "Bsc", 5);
        Jane.setQualification("Bsc");
        Accountant Drey= new Accountant("Drey", "Drey/001",
                8, "Bsc", "high", true);
        Drey.setWorkRate("High");
        Cleaner Agness = new Cleaner("Agness", "Agness/001",
                4,"Hnd", "average", true);
        Agness.setWorkRate("low");
        Staffs staffs1 = new Staffs("Cynthia", "Cynthia/897", 3,
                "Bsc", "High", true);
        staffs1.setWorkRate("high");



        Melvin.hire(Jane);
        Melvin.fire(Agness);
        Melvin.giveRaise(Drey);
        Agness.cleaning(Agness);
        Drey.paySalary(staffs1);



    }
}
