package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        updateToNewCat(home.cat, new Cat(newCatName));
    }

    private static void updateToNewCat(Cat cat, Cat newCat) {
        newCat = cat;
    }
}