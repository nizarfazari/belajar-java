package java_collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
*   Parent semua collections di java adalah Collections
*   Kalau Iterable interface sebgai kontrak untuk mengiterasi secara sequential
*   Collections merupakan kontrak untuk memanipulasi data collections
*   Collections nanti dibagi menjadi List,Queue,Set
* */
public class CollectionsApp {

    public static void main(String[] args) {

        // collection itu datanya dynamic berbeda dengan array yang statis kali di definisan 10 ya 10
        Collection<String> names =  new ArrayList<>();
        names.add("Nizar");
        names.add("Fazarei");
        names.add("test");
        names.addAll(List.of("Test2", "Test3"));

        // case sensitive
        // menghapus data
        names.remove("nizar");
        names.removeAll(List.of("Test2"));


        for (var name : names){
            System.out.println(name);
        }


        System.out.println(names.contains("test"));

        System.out.println(names.size());

    }
}
