package java_collections;

import java.util.Map;
import java.util.WeakHashMap;

/*
*   Weak Key di mana jika tidak digunakan lagi maka secara otomatis data di WeakMaps akan di hapus
*   Artinya jika terjadi garbage collection di java,bisa memungkinkan data di WeakMaps akan di hapus
*   WeakHashMap cocok di gunakan untuk menyimpan data cache di memory secara sementara
* */
public class WeakHashMapApp {
    public static void main(String[] args) {
        Map<Integer,Integer> map= new WeakHashMap<>();

        for (int i = 0;i <1_000_000;i++){
            map.put(i,i);
        }

        System.gc();
        System.out.println(map.size());
    }
}
