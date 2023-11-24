package java_collections;

import java.util.Iterator;
import java.util.List;

public class IterableApp {

    public static void main(String[] args) {

        // Super Interface semual collection bukan map
        Iterable<String> names = List.of("Nizar", "fazari", "budi");

        for (var name : names){
            System.out.println(name);
        }

        System.out.println("Iterator");
        Iterator<String> iterator = names.iterator();

        // Iterator manual
        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
