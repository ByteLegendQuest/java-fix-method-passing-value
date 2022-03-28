package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        updateToNewCat(home, new Cat(newCatName));
    }

    private static void updateToNewCat((Home home, Cat newCat) {
        home.cat = newCat;
    }
}
