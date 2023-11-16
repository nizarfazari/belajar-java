package oop_java.equals_hash_code;

public class Equals {

    public static void main(String[] args) {
        String first = "Nizar";
        first = first + " " + "Fazari";

        String second = "Nizar Fazari";

        System.out.println(first);

        System.out.println(first == second);

        String third = "Nizar Fazari";

        // ini menjadi true karena telah di optimize sama java karena pada second valuenya sama jadi ke refer ke objek yang sudah ada
        System.out.println(second == third);

        // perlu overide method equals karena
        System.out.println(first.equals(second));


        Product product = new Product("Mac", 2000);
        Product product2 = new Product("Mac", 2000);


        // default dari equals dari memory ( == )
        System.out.println(product.equals(product2));
        // digunakan nanti saat di java collection
        System.out.println(product.hashCode() == product2.hashCode());
    }



}
