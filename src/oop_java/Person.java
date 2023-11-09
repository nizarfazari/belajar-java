package oop_java;

public class Person {
    // membuat field
    String name;
    String address;
    final String country = "Indonesia";


    // constructor kalau membuat parameter seperti ini wajib untuk membuat sebuah objek dengan 2 parameter
    Person(String paramName, String paramAddress){
        // this di gunakan untuk mengakses pada objek
        this.name = paramName;
        this.address = paramAddress;
    }

    // constructor overloading
    Person(String paramName){
        this(paramName, null);
    }

    Person(){
        // memanggil constructor lain di tandai pada parameter jadi ini memanggil constructor ke 2
        this(null);
    }

    // membuat method
    void sayHello(String name){
        System.out.println("Hello" + name + ", My name is" + this.name);
    }
}
