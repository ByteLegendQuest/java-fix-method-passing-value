package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        updateToNewCat(home.cat, newCatName);
    }

    private static void updateToNewCat(Home home, String newCat) {
        Home.cat = newCat;
    }
}
