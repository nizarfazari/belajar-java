package oop_java.polymorphism;



public class PollyApp {
    public static void main(String[] args) {
        // jika type dari anak turunan bisa di gunakan ke dalam parent
        Employee employee = new Employee("Nizar");

        employee.sayHello("Budi");

        employee = new Manager("Iqbal");
        employee.sayHello("Budi");


        sayHello(new Employee("Nizar"));
        sayHello(new Manager("Nizar2"));
    }

    static void sayHello(Employee employee){
        // cara typecast jika ingin type objeknya sama
        if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello VP " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
