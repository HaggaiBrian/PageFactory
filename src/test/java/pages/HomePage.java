package pages;

import org.openqa.selenium.Keys;
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

    @FindBy(name = "btnK")
    private WebElement btnClick;

    public void setGoogleSearchbox(String searchTextbox) {
        searchGoogle.sendKeys(searchTextbox);
        searchGoogle.sendKeys(Keys.RETURN);
    }

    public void btnClick() {
        btnClick.click();
    }
}
