package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
       home.cat = updateToNewCat(home.cat, new Cat(newCatName));
    }

    private static Cat updateToNewCat(Cat cat, Cat newCat) {
       return cat = newCat;
    }
}
