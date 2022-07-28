package tests;

import org.testng.annotations.Test;

import site.MySite;

public class ExampleTests implements TestsInit {

    @Test
    public void openPageTest() {
        MySite.homePage.open();
        MySite.homePage.checkOpened();
    }
}
