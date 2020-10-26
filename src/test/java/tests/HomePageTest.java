package tests;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends BasePage {

    @Test
    public void searchGoogle() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setGoogleSearchbox("Test Automation");
        homePage.btnClick();
    }
}
