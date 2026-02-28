package models;

public enum EmployeePositions {

    DEVELOPER("Desarrollador"),
    ADMIN("Admin");

    private final String name;

    EmployeePositions(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
