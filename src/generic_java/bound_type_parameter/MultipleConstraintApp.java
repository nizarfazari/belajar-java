package generic_java.bound_type_parameter;

public class MultipleConstraintApp {
    public static void main(String[] args) {
//        Data<Manager> managerData = new Data<>(new Manager()); error karena tidak ada implements pada Manager
        Data<ViceManager> viceManagerData = new Data<>(new ViceManager());
    }


    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }


    public static class Manager extends Employee {}

    public static class ViceManager extends Employee implements CanSayHello{
        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    // hanya turunan dari Employee yang bisa dan jika di tambahkan interface hanya harus ada implements dari interface tsb
    // dan jika terdapat turunan atau interface kita dapat akses methodnya
    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
