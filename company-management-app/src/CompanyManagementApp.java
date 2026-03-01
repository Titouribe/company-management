import company.models.Company;
import company.service.CompanyService;
import company.service.CompanyServiceImpl;
import employee.model.Employee;
import employee.service.EmployeeService;
import employee.service.EmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import static utils.MenuUtils.*;

public class CompanyManagementApp {

    private static final Scanner scanner = new Scanner(System.in);
    private static final CompanyService companyService = new CompanyServiceImpl(scanner);
    private static final EmployeeService employeeService = new EmployeeServiceImpl(scanner);
    private static final List<Company> companies = new ArrayList<>();
    private static final List<Employee> employees = new ArrayList<>();

    static void main() {

        boolean finishProcess = false;

        while (!finishProcess) {

            printMainMenu();
            int option = getOption();

            switch (option) {
                case 1 -> companyMenu();
                case 2 -> employeeMenu();
                case 3 -> {
                    System.out.println("Saliendo de la aplicación. Todos los datos han sido eliminados.");
                    finishProcess = true;
                }
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.\n");
            }
        }
        scanner.close();
    }

    private static void companyMenu() {
        boolean returnToMainMenu = false;
        while (!returnToMainMenu) {
            printCompanyMenu();
            int option = getOption();

            switch (option) {
                case 1 -> {
                    companies.add(companyService.create());
                }
                case 2 -> printCompanies();
                case 3 -> {
                    Company company = findCompanyByNit();
                    Employee employee = employeeService.create();
                    employee.setCompany(company);
                    employees.add(employee);
                    companyService.addEmployee(company, employee);
                }
                case 4 -> {
                    Company company = findCompanyByNit();
                    companyService.countEmployees(company);
                }
                case 5 -> System.out.println(findCompanyByNit());
                case 6 -> returnToMainMenu = true;
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.\n");
            }
        }
    }

    private static void employeeMenu() {
        boolean returnToMainMenu = false;
        while (!returnToMainMenu) {
            printEmployeeMenu();
            int opcion = getOption();

            switch (opcion) {
                case 1 -> {
                    employees.add(employeeService.create());
                }
                case 2 -> printEmployees();
                case 3 -> {
                    Employee employee = findEmployeeByDocument();
                    System.out.println(employee);
                }
                case 4 -> calculateSalaryPerMonth();
                case 5 -> returnToMainMenu = true;
                default -> System.out.println("Opción inválida. Por favor, intente de nuevo.\n");
            }
        }
    }

    private static Company findCompanyByNit() {
        System.out.println("Ingrese el nit de la empresa que desea consultar: \n");
        String nit = scanner.nextLine();
        try {
            return companies.stream()
                    .filter(company -> Objects.nonNull(company.getName()))
                    .filter(company -> company.getNit().equals(nit))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("Empresa no encontrada."));
        } catch (IllegalArgumentException exception) {
            System.out.println("El nit que ingreso no corresponde a ninguna empresa registrada.");
            return findCompanyByNit();
        }
    }

    private static Employee findEmployeeByDocument() {
        System.out.println("Ingrese el numero de documento del empleado que desea consultar: \n");
        String document = scanner.nextLine();
        try {
            return employeeService.getEmployeeByDocument(employees, document);
        } catch (IllegalArgumentException exception) {
            return findEmployeeByDocument();
        }
    }

    private static void calculateSalaryPerMonth() {
        Employee employee = findEmployeeByDocument();
        System.out.println("Ingrese el numero de horas trabajadas en el mes: \n");
        int hours = scanner.nextInt();
        Double totalSalary = hours * employee.getSalaryPerHour();
        System.out.printf(String.format("El salario del empleado este mes es: %s", totalSalary));
    }


    private static void printCompanies() {
        System.out.println("Listando empresas...\n");
        companies.forEach(System.out::println);
    }

    private static void printEmployees() {
        System.out.println("Listando empleados...\n");
        employees.forEach(System.out::println);
    }

    private static int getOption() {
        System.out.print("Ingrese la opción que desea ejecutar: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException exception) {
            return 0;
        }
    }
}
