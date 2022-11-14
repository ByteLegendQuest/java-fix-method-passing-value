
public class Updater {
    public static void updateCat(Home home, String newCatName) {
        home.cat = new Cat(newCatName);
    }

    private static void updateToNewCat(Home cat, Cat newCat) {

        cat.cat = newCat;
    }
}