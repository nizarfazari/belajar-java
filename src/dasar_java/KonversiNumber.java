package dasar_java;

public class KonversiNumber {
    public static void main(String[] args) {
        // Widening Casting => byte -> short -> int -> long -> double
        // konversi tipe data number ada 2 : Widening Casting ( Otomatis ) dan Narrowing Casting ( manual )
        // Narrowing Casting => kebalikan dari widening


        // Widening Casting
        byte iniByte =  10;
        short iniShort = iniByte;
        int  iniInt = iniShort;

        // Narrowing casting  -> tapi hati" kalau kena number overflow
        // karena byte itu cuman 127 jadi nanti berputar sampai ke minus
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt;
    }
}
