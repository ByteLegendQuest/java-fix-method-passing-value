package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
       Home home2 = updateToNewCat(home.cat, new Cat(newCatName));
       home.cat = home2.cat;

    }

    private static Home updateToNewCat(Cat cat, Cat newCat) {
         Home h = new home();
        h.cat = cat;
        return h;
    }
}
