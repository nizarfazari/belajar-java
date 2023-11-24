package java_collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
*   List dapat duplikat => dapat duplikat
*   Data list berurut dengan posisi kita memasukan data
*   List memiliki index sehingga kita menggunakan nomor index untuk mendapatkan list
*   Turunan dari Collections
*   List di muat 10 terlebih dahulu stlhnya di coppy agar menjadi dinamis
* */
public class ListApp {

    /*
    *   Perbedaan List dan LinkedList
    *   add lebih cepat menggunakan LinkedList karena menambahkan node di akhir
    *   get lebih cepat list karena tinggal gunakan index tanpa cek node awal sampai akhir
    *   set sama lebih cepat list alasan sama seperti get
    *   remove lebih cepat linkeList karena kalau list harus menggeser data yang di belakang slth di hapus
    * */
    public static void main(String[] args) {

        // parameter bisa set untuk arraynya
        List<String> list = new ArrayList<>(100);
        List<String> linkList = new LinkedList<>();

        linkList.add("Nizar");
        linkList.add("fazari");

        list.add("Nizar");
        list.add("Fazari");

        list.set(0, "Budi");
        list.remove(1);
        System.out.println(list.get(0));

        for (var name : linkList){
            System.out.println(name);
        }


    }
}
