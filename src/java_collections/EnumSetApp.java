package java_collections;

import java.util.EnumSet;


/*
*   EnumSet adalah Set yang elemen datanya harus Enum
*   karena data Enum itu unik sehingga sangat cocok Set
* */
public class EnumSetApp {

    public static enum Gender {
        MALE,FEMALE,NOT_MENTION
    }


    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        EnumSet<Gender> genders1 = EnumSet.of(Gender.FEMALE,Gender.MALE);
        Gender[] genders2 = Gender.values();

        for (var gender : genders){
            System.out.println(gender);
        }
    }
}
