package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        home.cat=updateToNewCat(home.cat, new Cat(newCatName));
    }

    public static Cat updateToNewCat(Cat cat, Cat newCat) {
        cat = newCat;
        return cat;
    }
}
