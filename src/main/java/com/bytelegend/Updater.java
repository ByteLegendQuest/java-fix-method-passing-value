package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        updateToNewCat(home.cat, newCatName);
    }

    private static void updateToNewCat(Cat cat, String newCatName) {
        cat.name = newCatName;
    }
}
