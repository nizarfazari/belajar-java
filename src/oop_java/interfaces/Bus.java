package oop_java.interfaces;

public class Bus implements Car{
    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTire() {
        return 8;
    }


    public boolean isBig() {
        return true;
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public String getBrand() {
        return null;
    }
}
