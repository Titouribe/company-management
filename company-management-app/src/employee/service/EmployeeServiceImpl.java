package employee.service;

import company.models.Company;
import employee.model.Admin;
import employee.model.Developer;
import employee.model.Employee;
import employee.model.EmployeePositions;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private final Scanner scanner;

    private static List<String> positions = List.of(EmployeePositions.ADMIN.getName(), EmployeePositions.DEVELOPER.getName());

    public EmployeeServiceImpl(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Employee create() {
        System.out.println("Ingrese el documento del empleado: ");
        String document = scanner.nextLine();
        System.out.println("Ingrese el nombre del empleado: ");
        String name = scanner.nextLine();

        double salaryPerHour = 0;
        LocalDate joinDate = null;

        try {
            System.out.println("Ingrese el salario del empleado: ");
            salaryPerHour = Double.parseDouble(scanner.nextLine());
            System.out.println("Ingrese la fecha de ingreso a la empresa: ");
            joinDate = LocalDate.parse(scanner.nextLine());
        } catch (RuntimeException exception) {
            System.out.println("Ingreso un dato invalido, vuelva a intentarlo. ");
            this.create();
        }
        System.out.println("Ingrese el cargo del empleado (admin o desarrollador): ");
        String position = scanner.nextLine();

        if (!positions.contains(position)) {
            System.out.println("Ingreso un cargo invalido, debe ser admin o desarrollador. ");
            create();
        }

        System.out.printf("Se creo el empleado %s correctamente%n", name);
        return position.equalsIgnoreCase(EmployeePositions.ADMIN.getName()) ?
                new Admin(document, name, salaryPerHour, joinDate) :
                new Developer(document, name, salaryPerHour, joinDate);
    }

    @Override
    public Employee getEmployeeByDocument(List<Employee> employees, String document) {
        return employees.stream()
                .filter(employee -> employee.getDocument().equalsIgnoreCase(document))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Empleado no encontrado, vuelva a intentarlo."));
    }

    @Override
    public void countEmployees(Company company) {

    }
}
