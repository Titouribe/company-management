package company.models;

import employee.model.Employee;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {

    protected String nit;
    protected String name;
    protected String address;
    protected String city;
    protected List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String nit, String name, String address, String city) {
        this.nit = nit;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String getNit() {
        return nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public abstract String getCompanyType();

    @Override
    public String toString() {
        return String.format("""
                {
                    "nit" : %s,
                    "name" : %s,
                    "address" : %s,
                    "city" : %s,
                    "employees": %s
                }
                """, nit, name, address, city, employees.size());
    }
}
