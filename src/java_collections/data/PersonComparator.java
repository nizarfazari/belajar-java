package java_collections.data;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        // secara asc kalo desc tinggal di balik o2 yang pertama
        return o1.getName().compareTo(o2.getName());
    }


}
