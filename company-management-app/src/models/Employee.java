package models;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String document;
    private String name;
    private double salaryPerHour;
    private LocalDate joinDate;
    private Company company;

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

    @Override
    public String toString() {
        return String.format("""
                {
                    "document" : %s,
                    "name" : %s,
                    "address" : %s,
                    "joinDate" : %s,
                    "company": %s,
                    "hasJob" : %s
                }
                """, document, name, salaryPerHour, joinDate, Objects.nonNull(company) ? company.getName() : "Sin trabajo", Objects.isNull(company));
    }
}
