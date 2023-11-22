package generic_java;


import generic_java.generic_class.MyData;

/*
*   Covariant => bisa melakukan subtitusi child dengan parent
*   Caranya dengan menggunakan kata kunci ? extend Parents
*   Covariant Read Only / get doang
*   Contoh kita membuat Data<String> maka bisa di subsitusi mejadi Data<? Extends Object>
*/
public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> data = new MyData<>("Nizar");
        process(data);

        MyData<? extends  Object> data2 = data; // ini juga boleh
    }



    // covariant juga bisa di gunakan params
    public static void process(MyData<? extends  Object> myData){
        // jika menggunakan String hanya bisa get doang
        System.out.println(myData.getData());

        //  myData.setData(1); tidak boleh karena berbahaya
    }
}
