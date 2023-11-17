package java_standart_class;

public class StringApp {
    public static void main(String[] args) {
        String name  = " Muhammad Nizar Fazari";
        String toLowerCase = name.toLowerCase();
        String toUpperCase = name.toUpperCase();


        System.out.println(toLowerCase);
        System.out.println(toUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("Muhammad"));
        System.out.println(name.endsWith("Nizar"));
        String[] split = name.split(" ");
        for (var val : split){
            System.out.println(val);
        }

    }
}
