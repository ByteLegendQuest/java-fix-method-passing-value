
    public static void updateCat(Home home, String newCatName) {
        updateToNewCat(home.cat, new Cat(newCatName));
    }

 
    private static void updateToNewCat(Cat cat, Cat newCat) {
        cat.name = newCat.name;
    }
}