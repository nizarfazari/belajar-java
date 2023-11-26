package java_collections;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
*   Set adalah collection yang berisikan elemen yang unik tidak boleh duplikat
*   Set tidak memiliki index tidak ada jaminan datanya akan terurut datanya
*
*   Perbedaan HashSet dan LinkedHashSet
*   HashSet datanya tidak terurut sedangkan LinkedHashSet datanya terurut karena menggunakan linkedHashSet
*
*
* */
public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        Set<String> hashSet = new HashSet<>();

        names.add("Nizar");
        names.add("Fazari");
        names.add("Nizar");
        names.add("Fazari");

        hashSet.add("Nizar");
        hashSet.add("Fazari");
        hashSet.add("Nizar");
        hashSet.add("Fazari");

        for (var name : hashSet){
            System.out.println(name);
        }

    }
}
