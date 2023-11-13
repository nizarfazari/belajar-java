package oop_java.abstraction;

public class MainApp {
    public static void main(String[] args) {
        // var location = new Location(); // error
        var city = new City();
        city.name = "Muntilan";
        System.out.println(city.name);
        city.sayLocation();
    }
}
