package java_standart_class;

public class StringBuilderApp {

    public static void main(String[] args) {
        String name = "Muhammad";
        name = name + " " + "Nizar";
        name = name + " " + "Fazari";

        System.out.println(name);

        // di java dia meng exsecute 3 memori pada case ini
        // Muhammad
        // Muhammad Nizar
        // Muhammad Nizar Fazari
        // Jenis String di java itu tidak bisa di rubah jadi setiap kali execute membuat objek baru pada memorinya


        // jadi lebih baik mennggunakan String Builder
        // bisa juga menggunakan StringBuffer sama digunakan untuk memanipulasi String => bedanya di thread sage
        // StringBuffer => Thread Safe
        // StringBuilder => Thread Tidak Safe

        
        StringBuilder builder = new StringBuilder();
        builder.append("Nizar");
        builder.append(" ");
        builder.append("Fazari");


        // akan lebih baik kalau ingin memanipulasi string seprti ini karena
        // tidak akan memakan memori banyak hanya 1 saja
        String name2 = builder.toString();
        System.out.println(name2);





    }


}
