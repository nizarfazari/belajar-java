package dasar_java;

public class TipeDataPrimitif {
    public static void main(String[] args) {

        // di dalam java untuk menanadakan dia itu tipe primitif atau bukan dari
        // huruf kapitalnya, kalau huruf kapital itu tipe data primitif
        Integer iniInteger = 100;
        Byte iniByte = null;
        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

        // konversi dari primitif ke tidak primitif jika tipe datanya sama
        int iniInt = 100;
        Integer iniInteger2 = iniInt;
        System.out.println(iniInteger2);

        // konversi dari primitif ke tidak primitif jika tipe datanya tidak sama
        // menggunakan shortValue ataupun longValue
        short iniShort = iniInteger2.shortValue();
        System.out.println(iniShort);
    }
}
