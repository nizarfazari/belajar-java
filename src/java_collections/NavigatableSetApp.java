package java_collections;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigatableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Nizar","Fazari", "Budi"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> tailSetEx = names.tailSet("Fazari", true);

        for (var name : tailSetEx){
            System.out.println(name);
        }


        // immutable
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);


    }
}
