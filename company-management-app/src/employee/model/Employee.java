package employee.model;

import company.models.Company;

import java.time.LocalDate;

public abstract class Employee {

    protected String document;
    protected String name;
    protected double salaryPerHour;
    protected LocalDate joinDate;
    protected Company company;

    public Employee() {
    }

    public Employee(String document, String name, double salaryPerHour, LocalDate joinDate) {
        this.document = document;
        this.name = name;
        this.salaryPerHour = salaryPerHour;
        this.joinDate = joinDate;
    }

    public String getDocument() {
        return document;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    private void setJoinDate() {
        this.joinDate = LocalDate.now();
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
        setJoinDate();
    }

    public abstract void getPosition();
}
