package generic_java.comparable;

import java.util.Arrays;
import java.util.Comparator;

/*
*   Berbeda dengan Comparable harus implementasi
*   Comparator itu ada 2 parameter
*   Jika class milik orang lain maka menggunakan Comparator
* */
public class ComparatorApp {

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Nizar", "Indonesia"),
                new Person("Akbar", "Indonesia"),
                new Person("Bibu", "Indonesia")
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            // mengurutkan berdasarkan nama
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(persons);

        System.out.println(Arrays.toString(persons));

    }
}
