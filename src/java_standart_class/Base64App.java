package java_standart_class;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String original = "Nizar Faari";

         String encoded =  Base64.getEncoder().encodeToString(original.getBytes());
         System.out.println(encoded);
         byte[] bytes = Base64.getDecoder().decode(encoded);
         // untuk mengkonversi dalam bentuk String

        String res = new String(bytes);
        System.out.println(res);
    }
}
