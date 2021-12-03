package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppleStorePage extends BasePage {

    @FindBy(xpath ="//div[@class= 'brand-box__title']//a[contains(@href,'iphone')]" )
    private WebElement iphoneButton;

    @FindBy(xpath = "//div[@class='brand-box__title']//a[contains(@href,'macbook')]")
    private WebElement macBookButton;

    @FindBy(xpath = "//div[@class= 'brand-box__title']//a[contains(@href,'apple-watch')]")
    private WebElement appleWatchButton;


    public AppleStorePage(WebDriver driver) {
        super(driver);
    }

    public void clickIphoneButton() {
        iphoneButton.click();
    }

    public void clickMacBookButton(){ macBookButton.click();}

    public void clickAppleWatchPage(){appleWatchButton.click();}
}
