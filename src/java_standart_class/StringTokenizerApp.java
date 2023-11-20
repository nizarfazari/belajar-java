package java_standart_class;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Muhammad Nizar Fazari";
        StringTokenizer tokenizer = new StringTokenizer(name,",");

        // ini sama seperti split bedanya ini secara lazy
        // memetong setealh next token potong tokenizer => cocok pada file besar
        // kalo split langsung di potong semua => cocok pada file kecil

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }


}
