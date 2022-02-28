package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        updateToNewCat(home.cat, new Cat(newCatName));
    }

    public static void updateToNewCat(Cat cat, Cat newCat) {
        cat = newCat;
    }
}
