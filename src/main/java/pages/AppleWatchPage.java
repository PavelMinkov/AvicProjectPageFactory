package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleWatchPage extends BasePage {

    @FindBy(xpath = "//label[contains(@for,'chasov-series-6')]")
    private WebElement checkBox;

    public AppleWatchPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheckBox (){checkBox.click();}
}
