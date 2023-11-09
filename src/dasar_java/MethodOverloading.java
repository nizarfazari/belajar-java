package dasar_java;

public class MethodOverloading {
    public static void main(String[] args) {
        // method overloading
        // dapat di buat jika method tersebut memiliki nama yang sama, tetapi memiliki parameter berbeda
        // ataupun tipe parameter berbeda

        sayHello("Nizar");
        sayHello(20);
        sayHello("Nizar" , "Fazari");
    }


    static void sayHello(String firstName){
        System.out.println("Hello nama saya" + firstName);
    }

    static void sayHello(Integer firstName){
        System.out.println("Hello nama saya" + firstName);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello saya dengan nama " + firstName + lastName);
    }




}
