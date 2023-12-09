package java_collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/*
*   Terurut datanya
*   nge get akan lambat jika posisi di akhir
* */
public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();


        map.put("first", "Nizar");
        map.put("last", "Fazari");


        Set<String> keys = map.keySet();
        for (var key : keys){
            System.out.println(key);
        }
    }

}
