package oop_java.exception;


import oop_java.reflection.NotBlanks;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException,NullPointerException {
        if (loginRequest.username == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username.isBlank()) {
            throw new ValidationException("Username tidak boleh kosong");
        }else   if (loginRequest.password == null) {
            throw new NullPointerException("Password tidak boleh null");
        } else if (loginRequest.password.isBlank()) {
            throw new ValidationException("Password tidak boleh kosong");
        }
    }

    // jika jenis exception runtime tidak wajib memberi tanda throws dan tidak wajib trycatch
    public static void validateRuntime(LoginRequest loginRequest)  {
        if (loginRequest.username == null) {
            throw new NullPointerException("Username tidak boleh null");
        } else if (loginRequest.username.isBlank()) {
            throw new BlankException("Username tidak boleh kosong");
        }else   if (loginRequest.password == null) {
            throw new NullPointerException("Password tidak boleh null");
        } else if (loginRequest.password.isBlank()) {
            throw new BlankException("Password tidak boleh kosong");
        }
    }

    // Penggunaan Reflection
    public static void validationReflections(Object object){
        Class aClass = object.getClass();
        // kalo get field dapat yang public saja sedangkan getDeclared dapat semua
        Field[] fields = aClass.getDeclaredFields();

        for (var field : fields){
            // paksa jika access modifiernya private biar bisa di access
            field.setAccessible(true);
            if (field.getAnnotation(NotBlanks.class) != null){
                // validate
                try {
                    // kalau menggunaakn throw di atas jadi saat memanggil harus ada try catch
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + "is blank");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                }
            }
        }
    }
}
