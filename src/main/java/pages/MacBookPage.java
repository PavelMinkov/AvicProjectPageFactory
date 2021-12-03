package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MacBookPage extends BasePage {

    @FindBy(xpath = "//a[@class='prod-cart__buy']")
    private List<WebElement> addCartButtonList;

    @FindBy(xpath = "//span[contains(@class,'count--plus')]")
    private List<WebElement> addCountPlus;

    @FindBy(xpath = "//div[@class='cart-parent']//i[contains(@class,'btn-close')]")
    private List<WebElement> removeProduct;

    @FindBy(id = "js_cart")
    private WebElement addToCartPopup;

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement continueShoppingButton;

    public MacBookPage(WebDriver driver) {
        super(driver);
    }

    public void clickToAddCartButton() { addCartButtonList.get(0).click(); }

    public void clickToAddCartButtonNext() { addCartButtonList.get(1).click(); }

    public void clickToAddCartPlus() { addCountPlus.get(0).click(); }

    public void clickToRemoveProductFromCart(){removeProduct.get(0).click();}

    public WebElement getAddToCartPopup() {
        return addToCartPopup;
    }

    public void clickContinueShoppingButton() { continueShoppingButton.click(); }
}
