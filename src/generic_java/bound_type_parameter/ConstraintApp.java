package generic_java.bound_type_parameter;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> dataNumber = new NumberData<>(2);
        // NumberData<String> dataString = new NumberData<>("200"); Error


    }


    // Membatas generic type
    // jika ingin menambahkan multiple type tidak bisa 2 class karena di java hanya bisa 1 parent class jadinya params ke 2 adalah interface
    public static class NumberData <T extends Number> {

        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public NumberData(T data) {
            this.data = data;
        }
    }

}
