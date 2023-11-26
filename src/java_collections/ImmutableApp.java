package java_collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*   How to make immutable list
*   Collections.emtpyList() => membuat list kosong
*   Collections.singletonList(e) => membuat immutable list  berisi jadi 1 element
*   Collections.unmodifiableList(list)  => mengubah mutable list menjadi immutable list
*   List.of(e)  => Membuat immutable list dari element
*/
public class ImmutableApp {

    public static void main(String[] args) {
        // contoh immutable list
        List<String> one = Collections.singletonList("Satu");
        List<String> empty =Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("Nizar");
        mutable.add("Fazari");
        List<String> elemets = List.of("Nizar", "Fazari", "Budi");
        


    }
}
