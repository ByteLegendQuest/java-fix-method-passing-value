package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {

       Home h =  updateToNewCat(home, new Cat(newCatName));
       home.cat = h.cat;
    }

    private static Home updateToNewCat(Home home, Cat newCat) {
        Home h = home;
        h.cat = newCat;
        return h;
    }
}
