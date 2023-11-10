package oop_java.inheritance;

public class VicePresident  extends  Manager{


    @Override
    void sayHello(String name) {
        System.out.println( "Hi " + name + "Hello my name is VP " + this.name);
    }

    public static void main(String[] args) {
        // cara mengakses field atau method dari parent
        // ini masih menggunakan manager karo memanggil lewat objek manager
        var manager = new Manager();
        manager.name = "Nizar";
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "Nizar";
        vp.sayHello("Budi");

    }


}
