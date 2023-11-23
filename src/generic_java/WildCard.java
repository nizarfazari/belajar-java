package generic_java;

import generic_java.generic_class.MyData;

/*
*   Wildcard adalah tidak peduli dengan parameter type pada object
*   Kata kunci wildcard dengna ? pada generic type parameter
* */
public class WildCard {
    public static void main(String[] args) {
        printLenght(new MyData<>(100));
        printLenght(new MyData<>("asdas"));
    }

    // kalau terdapat wildcard jangan konversi pada tipe apapun WARNING ALERT
    public static void printLenght(MyData<?> data){
        System.out.println(data.getData());
    }
}
