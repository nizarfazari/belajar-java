package generic_java;


import generic_java.generic_class.MyData;

/*
*   Erasure adalah proses pengecekan generic pada saat
*   compile time,dan menghiraukan pengecekan saat runtime
*/
public class ErasureType {
    public static void main(String[] args) {

        // type erasue menghilangkan info dari si generic
        // jadi lebih aman masukan si data generic
        MyData stringData = new MyData<>("Nuzar");

//        MyData<Integer> integerData = (MyData<Integer>) stringData;  error jadi alert saat menggunakan konversi
//        Integer integer = integerData.getData();


        // seperti ini
        MyData<Integer> integerMyData = new MyData<>(2);
        System.out.println(integerMyData.getData());

    }



}
