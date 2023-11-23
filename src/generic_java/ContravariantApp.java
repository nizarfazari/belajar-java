package generic_java;

import generic_java.generic_class.MyData;


/*
*   Dapat melakukan subsitusi parent dengan child kebalikan covariant
*   kata kunci ? super subClass
*   perlu di perhatikan read / get
*   dapat set dan get
*/
public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> data = new MyData<>(100); // examp 100 / "Nizar"
        MyData<? super String> data2 = data;
        process(data);
        System.out.println(data.getData());

    }

    public static void process(MyData<? super String> myData){
        // String value = (String) myData.getData(); akan jadi masalah jika yang di set di awal adalah Integer jadinya harus di perhatikan saat get data
        Object value = myData.getData();
        System.out.println("Proccess paramater " + value);

        myData.setData("Nizar fazari");

    }
}
