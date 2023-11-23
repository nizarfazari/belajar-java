package generic_java;


import generic_java.generic_class.MyData;

/*
*   Secara default membuat generic params type sifat tersebut adalah invariant
*   Invariant artinya tidak boleh di subsitusi dengan child atau parent
*/
public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Nizar");
        //  MyData<Object> myData2  = myData; => error

        // karena String adalah turunan dari Object itu ttp tidak boleh walaupun sebaliknya dari Objek ke String
        MyData<Object> data = new MyData<>("Nizar");
        // MyData<String> data2 = data; => error

        // doit(myData); error
         doit(data);

    }


    public static void doit(MyData<Object> myData){
        // do nothing
    }
}
