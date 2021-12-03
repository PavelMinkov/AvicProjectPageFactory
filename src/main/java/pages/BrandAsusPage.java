package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandAsusPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href,'smartfonyi')][@class='brand__more']")
    private WebElement showMoreSmartphonesButton;

    public BrandAsusPage(WebDriver driver) { super(driver); }

    public void clickShowMoreSmartphones() {
        showMoreSmartphonesButton.click();
    }
}
