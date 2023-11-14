package oop_java.equals;

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

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
