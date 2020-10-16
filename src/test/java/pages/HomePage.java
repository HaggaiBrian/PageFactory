package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver _driver;

    public HomePage(WebDriver driver) {
        this._driver=driver;
        PageFactory.initElements(_driver, this);
    }

    @FindBy(name = "q")
    private WebElement searchGoogle;

    @FindBy(xpath = "//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")
    private WebElement searchClick;

    public void setGoogleTextbox(String searchTextbox) {
        searchGoogle.sendKeys(searchTextbox);
    }

    public void searchClick() {
        searchClick.click();
    }
}
