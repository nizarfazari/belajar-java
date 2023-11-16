package oop_java.InnerClass;

public class MainApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Nizar");

        //cara pembuatan Object Inner Class
        // keuntungan membuat inner class ialah dapat mengakses pada outer classnya
        Company.Employee employee = company.new Employee();
        employee.setName("Fazari");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
