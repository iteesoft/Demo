package com.company;

public class Company {
    private String nameOfCompany;
    private String addressOfCompany;
    private Ceo ceo;
    private Accountant accountant;
    private Applicant applicant;
    private Cleaner cleaner;

    public Company(String nameOfCompany, String addressOfCompany, Ceo ceo, Accountant accountant, Applicant applicant, Cleaner cleaner) {
        this.nameOfCompany = nameOfCompany;
        this.addressOfCompany = addressOfCompany;
        this.ceo = ceo;
        this.accountant = accountant;
        this.applicant = applicant;
        this.cleaner = cleaner;
    }
}
