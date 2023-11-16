package oop_java.abstraction;


// Abstract class tidak dapat di buat hanya dapat di turunkan
public abstract class Location {
    String name;

    // bisa membuat sebuah abstract method yang nantinya di gunakan untuk overide pada child class
    // abstrac method tidak boleh memiliki access modifier private
    public abstract void sayLocation();
}
