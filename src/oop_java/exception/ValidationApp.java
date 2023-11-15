package oop_java.exception;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("","");

        // ini harus menggunakan / wajib trycatch karena menyebabkan exception
        // ValidationUtil.validate(loginRequest);


        // cara handle 2 exception yang sama
//        try {
//            ValidationUtil.validate(loginRequest);
//            System.out.println("Data valid");
//        }catch (ValidationException validationException){
//            System.out.println("Data tidak valid " + validationException.getMessage());
//        }catch (NullPointerException nullPointerException){
//            System.out.println("Data  null " + nullPointerException.getMessage());
//        }

        // Merge exception kalau penanganannya sama
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch (ValidationException | NullPointerException e){
            System.out.println("Data tidak valid " + e.getMessage());
        }finally {
            System.out.println("asdas");
        }

    }
}
