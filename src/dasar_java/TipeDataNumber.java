package dasar_java;

public class TipeDataNumber {
    public static void main(String[] args) {
        // Ada 2 tipe data number

        // Integer = bilangan bulat
        // 127 -> 1 byte
        byte iniByte = 100;
        // 32 767 -> 2 byte
        short iniShort = 1000;
        // 4 byte
        int iniInt = 1000000000;
        // 8 byte
        long iniLong = 1000000000;
        long iniLong2 = 1000000L;

        // Floating Point Number  = bilangan desimal
        // 4 byte
        float iniFloat = 10.12F;
        // 8 byte
        double iniDouble =  10.10;

        // kode literals
        int decimalInt = 25;
        // kata kuncinya tinggal di tambahkan 0x atau 0b tergantu kode literalsnya
        int hexInt = 0xA132B;
        int bInt =  0b0101010;

        // kode underscore -> hanya untuk pemisah
        long balance = 1_000_000_000_000L;
        int sum = 1_000_000;


    }
}
