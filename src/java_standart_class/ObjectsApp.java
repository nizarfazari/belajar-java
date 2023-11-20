package java_standart_class;

import java.util.Date;
import java.util.Objects;

public class ObjectsApp {

    public static class Data {
        private String data;

        public String getData() {
            return data;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Data data1 = (Data) object;
            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }

        public void setData(String data) {
            this.data = data;
        }

        public Data(String data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
    executu(new Data("Nizar"));
    }

    public static void executu(Data data){
        // akan terjadi nullException jadi tidak aman
        if (data != null){
            System.out.println(data.toString());
            System.out.println(data.hashCode());
        }

        // agar bisa langunsg tanpa pengecekan if data != null
        System.out.println(Objects.hashCode(data));
        System.out.println(Objects.toString(data));
    }
}
