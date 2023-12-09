package java_collections;


import java.util.HashMap;
import java.util.Map;

/*
*   Map adalah data collection yang berisikan mapping antara key dan value
*   Key di sini harus unik, 1 key cuman boleh mapping ke satu key
*   Map mirip dengan array, bedanya di array itu berisi index(integer) sedangkan key map bebas
*
*   Implementasi Map terdapat 5
*   HashMap || WeakHashMap || IdentifyHashMap || LinkedHashMap || EnumHashMap
*
*   HashMap adalah implemtasi Map yang melakukan distribusi key menggunakan HashCode() function
*   HashMap sangat bergantung pada HashCode function
* */
public class HashMapApp {

    public static void main(String[] args) {
    Map<String,String> map = new HashMap<>();

    // put itu insert atau update
    map.put("name.first", "Nizar");
    map.put("name.middle" , "fazari");

    System.out.println(map.get("name.first"));

    }
}
