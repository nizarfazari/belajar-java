package generic_java.generic_class;

public class Pair<T,S> {
    private T data;
    private S data2;

    public T getData() {
        return data;
    }

    public S getData2() {
        return data2;
    }

    public Pair(T data, S data2) {
        this.data = data;
        this.data2 = data2;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setData2(S data2) {
        this.data2 = data2;
    }
}
