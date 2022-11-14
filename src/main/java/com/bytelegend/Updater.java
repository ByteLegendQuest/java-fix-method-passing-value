
public class Updater {
    public static void updateCat(Home home, String newCatName) {
        updateToNewCat(home, newCatName);
    }

    private static void updateToNewCat(Home home, String newCat) {
        home.cat = newCat;
    }
}