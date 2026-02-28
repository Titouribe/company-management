package operaciones;

import models.Company;
import models.Employee;

import java.util.List;

public interface CompanyService {

    Company create();

    void addEmployee(Company company, Employee employee);

    List<Employee> getEmployees();

    void countEmployees(Company company);
}
