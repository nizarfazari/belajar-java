package java_collections.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addHobby(String hobby){
        hobbies.add(hobby);
    }


    /*
    *   Protect listnya secara immutable
    * */
    public List<String> getHobby(){
        return Collections.unmodifiableList(hobbies);
    }


    public void setName(String name) {
        this.name = name;
    }
}
