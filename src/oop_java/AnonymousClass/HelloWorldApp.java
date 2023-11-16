package oop_java.AnonymousClass;

public class HelloWorldApp {
    public static void main(String[] args) {

        // kekurangannya tidak bisa di reuse
        HelloWorld helloWorld = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Test");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("sadas");
            }
        };
    }
}
