package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {
        Home home1 = new Home(new Cat(newCatName));
        home.cat = home1.cat;
    }
}
