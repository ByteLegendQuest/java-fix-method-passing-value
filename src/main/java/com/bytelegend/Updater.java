package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        Cat newCat = new Cat(newCatName);
        updateToNewCat(home, newCat);
    }

    private static void updateToNewCat(Home home, Cat newCat) {
        home.cat = newCat;
    }
}
