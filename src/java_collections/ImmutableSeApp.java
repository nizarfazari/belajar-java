package java_collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSeApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Nizar");
        Set<String> names = new HashSet<>();

        names.add("Nizar");
        names.add("Fazari");
        names.add("Nizar");
        names.add("Fazari");


        Set<String> immutable = Collections.unmodifiableSet(names);
        Set<String> set = Set.of("Nizar", "Fazari");
        

    }
}
