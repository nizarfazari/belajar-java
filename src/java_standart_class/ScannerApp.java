package java_standart_class;

import java.util.Scanner;

/*
*   Untuk membaca input file entah file,console
*   cocok dijadikan untuk membaca input user
*/
public class ScannerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama : ");
        String nama = scanner.nextLine();

        System.out.print("Umur : ");
        Integer age = scanner.nextInt();

        System.out.println("Hello " + nama + " Umur anda " + age);
    }


}
