package java_standart_class;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 1000;
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();


        String contoh = "1000";

        // valueof untuk mengkonver string ke number dengan tipe data non primitif
        Integer contohInt = Integer.valueOf(contoh);
        // valueof untuk mengkonver string ke number dengan tipe data primitif
        int contohIntPrim = Integer.parseInt(contoh);
        System.out.println(contohIntPrim);
    }
}
