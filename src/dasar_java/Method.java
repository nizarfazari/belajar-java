package dasar_java;

public class Method {

    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("Nizar", "Fazari");
        var c = sum(20, 4);
        System.out.println(c);

        sayCongrats("Nizar", 80,80);
    }

    static void sayHelloWorld(){
        System.out.println("Hello World 1");
    }


    // method with paramater
    static void sayHello(String firstName, String lastName){
        System.out.println(firstName + lastName);
    }

    // method with return value
    static int sum(int value1, int value2){
        return  value1 + value2;
    }


    // method variable argument
    static void sayCongrats(String name , int... values){
        var total = 0;

        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;
        if(finalValue >= 75){
            System.out.println("Congrats  lulus" + name);
        }else {
            System.out.println("Maaf belum lulus" + name);
        }
    }

}

