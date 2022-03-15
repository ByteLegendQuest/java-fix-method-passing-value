package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        Cat newCat = new Cat(newCatName);
        updateToNewCat(home.cat, newCat);
    }

    private static void updateToNewCat(Cat cat, Cat newCat) {
        cat = newCat;
    }
}
