package com.bytelegend;

public class Home {
    public Cat cat;

    public Home(Cat cat) {
        this.cat = cat;
    }


    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public static void main(String[] args) {
        Home home = new Home(new Cat("White"));
        System.out.println("Cat is: " + home.cat);
        Updater.updateCat(home, "Black");
        System.out.println("Cat is: " + home.cat);
    }
}
