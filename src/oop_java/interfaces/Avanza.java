package oop_java.interfaces;

public class Avanza implements Car{

    public String getBrand() {
        return null;
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public void drive() {
        System.out.println("Avanza drive");
    }

    @Override
    public int getTire() {
        return 0;
    }
}
