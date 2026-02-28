package models;

import java.time.LocalDate;
import java.util.Objects;

public class Developer extends Employee {

    private final EmployeePositions position;

    public Developer(String document, String name, double salaryPerHour, LocalDate joinDate) {
        super(document, name, salaryPerHour, joinDate);
        this.position = EmployeePositions.DEVELOPER;
    }

    @Override
    public void getPosition() {
        System.out.printf(String.format("La posición del empleado es: %s", position.getName()));
    }

    @Override
    public String toString() {
        return String.format("""
                Imprimiendo datos de desarrollador
                {
                    "document" : %s,
                    "name" : %s,
                    "position": %s,
                    "salaryPerHour": %s,
                    "joinDate" : %s,
                    "company": %s,
                    "hasJob" : %s
                }
                """, document, name, position, salaryPerHour, joinDate, Objects.nonNull(company) ? company.getName() : "Sin trabajo", Objects.isNull(company));
    }
}
