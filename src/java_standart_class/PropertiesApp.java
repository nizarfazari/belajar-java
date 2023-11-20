package java_standart_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream("application.properties"));

            // untuk mendapatkan data
            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            System.out.println(host);
            System.out.println(port);


        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("File tidak ketemu");
        }catch (IOException exception){
            System.out.println("Gagal data load dari file");
        }




        try {
            // set data properties
            properties.put("name.first", "nizar");
            properties.put("name.last", "nizar");
            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");

        }catch (FileNotFoundException exception){
            System.out.println("Error membuat file ");
        }catch (IOException exception){
            System.out.println("Error menyimpan properties");
        }
    }


}
