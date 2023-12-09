package java_collections;

import java.util.IdentityHashMap;
import java.util.Map;


/*
*   Implementasi Map seperti HashMap
*   yang membedakannya pengecekan datanya tidak menggunakan equals melainkan operator == (reference quality)
*   Artinya data di anggap sama jika memang lokasi di memeory tersebut sama
*
* */
public class IdentityHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new IdentityHashMap<>();
        String key1 = "name.first";

        String name =  "name";
        String dot =  ".";
        String first =  "first";

        String key2 = name + dot + first;
        System.out.println(key1.equals(key2));

        // mengecek lewat memory
        System.out.println(key1 == key2);


        map.put(key1, "Nizar");
        map.put(key2, "Nizar");

        System.out.println(map.size());
    }




}
