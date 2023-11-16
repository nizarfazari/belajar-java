package oop_java.to_string_method;

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

}
