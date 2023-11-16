package oop_java.equals_hash_code;

import java.util.Objects;

public class Product {
    private String name;
    private Integer  price;


    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    // untuk membacanya itu lebih enak karena default dari java ialah toString
    public String toString(){
        return "Product Name : " + name + " Dengan harga : " + price;
    }

    // bisa di generate otomatis equalsnya


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }


    // reprsentasi pada integer mirip sama toString
    // hashcode untung membuat struktur data yang unique spt HashMap,Set


    // kontrak hashcode saat di overide
    // kalau di bandingkan dengan equals dan hasilnya sama maka nilai hashcode juga sama dan sebaliknya
    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
