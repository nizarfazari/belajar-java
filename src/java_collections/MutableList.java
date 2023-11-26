package java_collections;

import java_collections.data.Person;

import java.util.Collections;
import java.util.List;


/*
*   Mutable adalah dapat di ganti
*/
public class MutableList {
    public static void main(String[] args) {
        Person person = new Person("Nizar");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobby());
        for (var hobby : person.getHobby()){
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        // error nya bakaln menunjukan di sini
        hobbies.add("ASD");
    }
}
