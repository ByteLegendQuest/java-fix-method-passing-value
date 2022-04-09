package com.bytelegend;

public class Updater {
    public static void updateCat(Home home, String newCatName) {

        home.cat =  new Cat(newCatName);
    }
}
