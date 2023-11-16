package oop_java.abstraction;

public class City extends Location{
    @Override
    public void sayLocation() {
        System.out.println("Lokasi pada " + name);
    }
}
