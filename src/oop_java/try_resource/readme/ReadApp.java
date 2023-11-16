package oop_java.try_resource.readme;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {
//        BufferedReader bufferedReader = null;

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("readme.md"))){
//            bufferedReader = new BufferedReader(new FileReader("readme.md"));

            while (true){
                String text = bufferedReader.readLine();
                if (text == null){
                    break;
                }
                System.out.println(text);
            }

        }catch (Throwable throwable){
            System.out.println("Error membaca file" + throwable.getMessage());
        }
//        finally {
//
//            // ini kalo memnutup secara manual resourcenya
//            // karena close pada buffrede reader mengembalikan error jadi harus di trycatcch
//            if(bufferedReader != null){
//                try {
//                    bufferedReader.close();
//                }catch (IOException exception){
//                    System.out.println("Error menutup resource " + exception.getMessage());
//                }
//            }
//        }
    }
}
