package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        Cat newCat = new Cat(newCatName);
        home.cat = newCat;
    }
}
