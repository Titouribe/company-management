package operaciones;

import models.Company;
import models.Employee;

import java.util.List;
import java.util.Scanner;

public class CompanyServiceImpl implements CompanyService {

    private Scanner scanner;

    public CompanyServiceImpl(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public Company create() {
        System.out.println("Ingrese el nit de la empresa: ");
        String nit = scanner.nextLine();
        System.out.println("Ingrese el nombre de la empresa: ");
        String name = scanner.nextLine();
        System.out.println("Ingrese la dirección de la empresa: ");
        String address = scanner.nextLine();
        System.out.println("Ingrese la ciudad de la empresa: ");
        String city = scanner.nextLine();

        Company company = new Company(nit, name, address, city);
        System.out.printf("Se creo la compañia %s correctamente", name);

        return company;
    }

    @Override
    public void addEmployee(Company company, Employee employee) {
        company.addEmployee(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return List.of();
    }

    @Override
    public void countEmployees(Company company) {
        System.out.printf("La empresa %s tiene %s empleados%n", company.getName(), company.getEmployees().size());
    }
}
