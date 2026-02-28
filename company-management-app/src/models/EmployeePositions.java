package models;

public enum EmployeePositions {

    DEVELOPER("desarrollador"),
    ADMIN("admin");

    private final String name;

    EmployeePositions(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
