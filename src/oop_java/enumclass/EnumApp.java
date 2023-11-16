package oop_java.enumclass;

class Customer {
    Level level;
}

public class EnumApp {

    public static void main(String[] args) {
        Customer customer = new Customer();
        // cara mengakses spt static
        customer.level = Level.VIP;
        System.out.println(customer.level);
        System.out.println(customer.level.getDescription());


        // cara konversi enum ke string
        String levelName = Level.VIP.name();

        // cara konversi string ke Enum
        Level levelEnum = Level.valueOf("VIP");

        // mengambil semua data dari enum
        Level[] levelArray = Level.values();

        System.out.println(levelName);
        System.out.println(levelEnum);
        for (var value : levelArray){
            System.out.println(value);
        }


    }
}
