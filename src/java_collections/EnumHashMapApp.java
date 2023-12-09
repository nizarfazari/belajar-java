package java_collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum Level {
        FREE,STANDART, PREMIUM , VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<>(Level.class);

        map.put(Level.FREE, "Nizar");
        map.put(Level.STANDART, "Fazari");

        for (var key  : map.keySet()){
            
        }
    }
}
