package generic_java.generic_params_method;

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[]  names = {"Nizar", "Fazar"};
        Integer[] numbers = { 2,4,5,6 };


        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(names));
    }
}
