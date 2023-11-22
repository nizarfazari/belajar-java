package generic_java.generic_class;


/*
*   Generic Class adalah interface memiliki parameter type
*   Nama generic type yang biasa di gunakan
*   E = Element
*   K = Key
*   T = Type
*   V = Value
*   SUV 2nd,3rd,4th
*/

public class MyData<T> {
    private T  data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
