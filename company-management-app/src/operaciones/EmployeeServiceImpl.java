package operaciones;

import models.*;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private Scanner scanner;

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
    public List<Employee> getEmployees() {
        return List.of();
    }

    @Override
    public void countEmployees(Company company) {

    }
}
