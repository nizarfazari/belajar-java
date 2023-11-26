package java_collections;

import java_collections.data.Person;
import java_collections.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> personSortedSet = new TreeSet<>(new PersonComparator());
        personSortedSet.add(new Person("Nizar"));
        personSortedSet.add(new Person("Fazari"));
        personSortedSet.add(new Person("Budi"));

        for (var person : personSortedSet){
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(personSortedSet);
    }
}
