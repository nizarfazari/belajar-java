package oop_java.static_class;

public class MainApp {

    // kegunaan dari static ialah bisa langsung di kases tanpa instace
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(MathUtil.sum(1,2,3,4));
        Contry.City city  =new Contry.City();
        city.setName("asdas");
    }
}
