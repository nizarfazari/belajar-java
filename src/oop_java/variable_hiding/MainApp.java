package oop_java.variable_hiding;

public class MainApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Nizar";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        // ini mengakases method yang di overidenya yaitu childnya karena berasalah dari child
        parent.doIt();
        // sedangkan ini karena sudah di konvesi jadi mengakses yang pertama yaitu variable parent jadi terkena variable hiding
        System.out.println(parent.name);
        // tidak di sarankan bikin nama yang sama pada child dan parent
    }
}
