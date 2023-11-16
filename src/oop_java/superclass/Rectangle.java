package oop_java.superclass;

public class Rectangle extends  Shape{
    @Override
    String getCorner() {
        return "Kotak";
    }

    Rectangle(String bentuk){
        // bisa memanggil salah satu contructor
        super(bentuk,null   );
    }

    // untuk mengakses getCorner pada parent yang di dalam class sini telah di overide
    String getParentCorner(){
        return  super.getCorner();
    }

    public static void main(String[] args) {
        var rectangle =  new Rectangle("Segitiga");
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
