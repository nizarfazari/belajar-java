package oop_java.interfaces;


// saat bikin interface di sini semuanya adalah public dan abstract bedanya di sini fieldnya itu constata
// bikin kontrak biasanya pakai interface
// child class bisa implements lebih dari 1 interface
// dari interface ke interface lain bisa di wariskan dan bisa lebih dari 1
public interface Car extends HasBrand,IsMaintenance {
    void drive();

    int getTire();


    // penggunaan default agar methodnya konkrit
    // jika menggunakan default method semua turunanya tidak wajib meng overide si methodnya
    // adanya pada java versi 8 >
     default boolean isBig(){
         return  false;
     };

    @Override
    String getBrand();

    @Override
    boolean isMaintenance();
}
