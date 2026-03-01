package employee.service;

import company.models.Company;
import employee.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create();

    List<Employee> getEmployees();

    void countEmployees(Company company);
}
