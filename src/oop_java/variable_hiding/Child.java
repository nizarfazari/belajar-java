package oop_java.variable_hiding;

public class Child extends  Parent{
    String name;
    void doIt(){
        System.out.println("Do it Child" + super.name);
    }

    public static void main(String[] args) {

    }
}
