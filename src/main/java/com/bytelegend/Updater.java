public class Updater {
    public static void updateCat(Home home, String newCatName) {
        //updateToNewCat(home.cat, new Cat(newCatName));
        home.cat = new Cat(newCatName);
    }

