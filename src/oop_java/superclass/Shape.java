package oop_java.superclass;

public class Shape {
    String bentuk;
    Integer ukuran;
    String getCorner(){
        return  bentuk;
    }

    // jika di dalam contructor terdapat params, child class harus terdapat consturctor bisa di isi dengan null
    Shape(String bentuk){
        this.bentuk = bentuk;
    }
    Shape(String bentuk, Integer ukuran){
        this.bentuk = bentuk;
        this.ukuran = ukuran;
    }
}
