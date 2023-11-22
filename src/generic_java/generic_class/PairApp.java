package generic_java.generic_class;

public class PairApp {

    public static void main(String[] args) {
        Pair<String, Integer>  pair = new Pair<String,Integer>("Nizar", 100);
        System.out.println(pair.getData());
    }

}
