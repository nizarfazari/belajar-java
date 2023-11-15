package oop_java.exception;

public class DatabaseApp {


    public static void main(String[] args) {
        // case error digunakan error yang harus di pastikan untuk mematikan app dan tidak di rekomendasikan trycatch
        connectDatabase("22","22");
        System.out.println("sukses");
    }
    public static void connectDatabase(String username,String password){
        if(username == null || password == null){
            throw new DatabaseError("Tidak bisa connect database");
        }
    }
}
