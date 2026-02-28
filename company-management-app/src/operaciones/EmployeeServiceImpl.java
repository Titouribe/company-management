package operaciones;

import models.Company;
import models.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private Scanner scanner;

    public EmployeeServiceImpl(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Employee create() {
        System.out.println("Ingrese el documento del empleado: ");
        String document = scanner.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
        String name = scanner.nextLine();
        System.out.println("Ingrese el salario del empleado: ");
        double salaryPerHour = Double.parseDouble(scanner.nextLine());
        System.out.println("Ingrese la fecha de ingreso a la empresa: ");
        LocalDate joinDate = null;
        try {
            joinDate = LocalDate.parse(scanner.nextLine());
        } catch (DateTimeParseException exception) {
            System.out.println("Ingreso una fecha invalida, debe ser en formato year-month-day, ejemplo: 2026-02-28");
            this.create();
        }
        Employee employee = new Employee(document, name, salaryPerHour, joinDate);
        System.out.printf("Se creo el empleado %s correctamente%n", name);

        return employee;
    }

    @Override
    public List<Employee> getEmployees() {
        return List.of();
    }

    @Override
    public void countEmployees(Company company) {

    }
}
