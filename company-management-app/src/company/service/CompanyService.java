package company.service;

import company.models.Company;
import employee.model.Employee;

import java.util.List;

public interface CompanyService {

    Company create();

    void addEmployee(Company company, Employee employee);

    List<Employee> getEmployees();

    void countEmployees(Company company);
}
