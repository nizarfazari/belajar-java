package oop_java.inheritance;

public class VicePresident  extends  Manager{
    // cara mengakses field atau method dari parent


    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Nizar";
        manager.sayHello();

    }
}
