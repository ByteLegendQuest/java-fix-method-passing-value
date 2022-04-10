package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        home.cat = updateToNewCat(new Cat(newCatName));
    }

    private static Cat updateToNewCat(Cat newCat) {
        return newCat;
    }
}
