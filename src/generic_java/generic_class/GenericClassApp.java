package generic_java.generic_class;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Nizar");
        MyData<Integer> integer = new MyData<>(2);


        System.out.println(myData.getData());
        System.out.println(integer.getData());

    }
}
