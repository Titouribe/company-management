package employee.service;

import company.models.Company;
import employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create();

    Employee getEmployeeByDocument(List<Employee> employees, String document);

    void countEmployees(Company company);
}
