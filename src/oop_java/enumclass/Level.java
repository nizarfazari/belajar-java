package oop_java.enumclass;

public enum  Level {
    STANDART("Stadart Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    // karena di sini terdapat constructor enumnya harus panggil si constructor
    Level(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
