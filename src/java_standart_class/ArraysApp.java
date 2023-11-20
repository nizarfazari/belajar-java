package java_standart_class;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        Integer[] numbers = {
                1,22,100,200,300,4,5,6,8,4
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        // returnnya indexnya
        System.out.println(Arrays.binarySearch(numbers, 22));
        System.out.println(Arrays.binarySearch(numbers, 300));
        // kalo tidak ada hasilnya dibawah 0 hasilnya
        System.out.println(Arrays.binarySearch(numbers, 222));

        Integer[] res =  Arrays.copyOf(numbers, 5);

        System.out.println(Arrays.toString(res));
    }
}
