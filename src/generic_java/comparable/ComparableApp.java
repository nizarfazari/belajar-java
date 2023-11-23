package generic_java.comparable;

import java.util.Arrays;

/*
*  Perbadingan 2  harus menggunakan implemtasi pada Object yang di buat
*/
public class ComparableApp{

    public static void main(String[] args) {
        Person[] persons = {
                new Person("Nizar", "Indonesia"),
                new Person("Akbar", "Indonesia"),
                new Person("Bibu", "Indonesia")
        };

        // kalau tidak menggunakan Comparable akan error karena tidak di implementasi
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

    }
}
