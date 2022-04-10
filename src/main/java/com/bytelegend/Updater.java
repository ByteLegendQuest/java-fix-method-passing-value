package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        Cat cat = updateToNewCat(home.cat, new Cat(newCatName));
        home.cat = cat;
    }

    private static Cat updateToNewCat(Cat cat, Cat newCat) {
        return new Cat(newCat.name);
    }
}
