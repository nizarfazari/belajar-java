package java_standart_class;

import java.util.Calendar;
import java.util.Date;

/*
*   Untuk memanipulasi tanggal yang baru menggunakan Java Date Time
*   Class Date : representasi tanggal sampai presisi milisecond
*   Class method ada yang di deprecated sehingga untuk memanipulasi
*   Date untuk representasi tanggal , Calendar untuk memanipulasi tanggal
*/
public class DateApp {
    public static void main(String[] args) {
        Date date = new Date();
        long milisecond = date.getTime();

        // defaultnya jam saat ini
        System.out.println(date);
        System.out.println(milisecond);


        // kalender saat ini
        Calendar calendar = Calendar.getInstance();

        // untuk memanipulasi data tahun
        calendar.set(Calendar.YEAR, 2000);
        // untuk mengurangi kalendar 10
        // calendar.add(Calendar.YEAR, -10);

        
        // untuk mendapatkan waktu
        Date res = calendar.getTime();
        System.out.println(res);



    }



}
