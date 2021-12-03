package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class IphonePage extends BasePage {

    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    private List<WebElement> addCartButtonList;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement continueShoppingButton;

    public IphonePage(WebDriver driver) {
        super(driver);
    }

    public void clickToAddCartButton() {
        addCartButtonList.get(0).click();
    }

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public void clickContinueShoppingButton() {
        continueShoppingButton.click();
    }
}
