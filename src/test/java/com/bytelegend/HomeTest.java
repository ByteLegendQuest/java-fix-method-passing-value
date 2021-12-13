package com.bytelegend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void test() {
        Home home = new Home(new Cat("Alice"));
        Updater.updateCat(home, "Bob");
        Assertions.assertEquals("Cat(Bob)", home.cat);
    }
}
