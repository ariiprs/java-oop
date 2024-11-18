package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class CompanyApp {

    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Indomarco");

        Company.Employee employee = company.new Employee();
        employee.setName("Arie");
        System.out.println(employee.getCompany());
        System.out.println(employee.getName());

        Company company1 = new Company();
        company1.setName("Eiger");

        Company.Employee employee1 = company1.new Employee();
        employee1.setName("Luthfi");
        System.out.println(employee1.getName());
        System.out.println(employee1.getCompany());
    }
}
