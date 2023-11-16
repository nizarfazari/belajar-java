package oop_java.polymorphism;

public class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println( "Hi " + name + "Hello my name is Employee " + this.name);
    }
}
