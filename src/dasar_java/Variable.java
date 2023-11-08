package dasar_java;

public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Muhammad Nizar Fazari";

        int age = 30;
        String address = "Muntilan";

        System.out.println(name + "dengan usia " + age);


        //  tipe data akan menyesuaikan dengan value dan wajib langsung di inisialisasikan valuenya
        var ages = 20;
        System.out.println(ages);

        // variable final yang tidak bisa di ubah-ubah datanya spt konstant pada js
        final  int umur = 20;

        // error
        // umur = 21;


    }
}
