package java_standart_class;


import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("," ,"[", "]");

        stringJoiner.add("Nizar");
        stringJoiner.add("Fazari");

    String join = stringJoiner.toString();
        System.out.println(join);
    }

}
