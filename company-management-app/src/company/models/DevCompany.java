package company.models;

public class DevCompany extends Company {

    public DevCompany() {
    }

    public DevCompany(String nit, String name, String address, String city) {
        super(nit, name, address, city);
    }

    @Override
    public String getCompanyType() {
        return "Soy una empresa de desarrollo.";
    }
}
