package oop_java.polymorphism;

public class Manager extends  Employee{
    String company;

    Manager(String name){
        super(name);
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    @Override
    void sayHello(String name) {
        System.out.println( "Hi " + name + "Hello my name is Manager " + this.name);
    }
}
