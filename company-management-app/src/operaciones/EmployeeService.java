package operaciones;

import models.Company;
import models.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create();

    List<Employee> getEmployees();

    void countEmployees(Company company);
}
