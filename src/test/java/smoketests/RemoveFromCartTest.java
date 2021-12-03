package smoketests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemoveFromCartTest extends BaseTest{

    private static final String EXPECTED_AMOUNT_OF_PRODUCTS_CART_IN_CART_REMOVED = "0";

    @Test
    public void checkRemoveToCart() throws InterruptedException {
        getHomePage().clickProductCatalogButton();
        getHomePage().clickAppleStoreButton();
        getAppleStorePage().clickMacBookButton();
        getMacBookPage().waitForPageLoadComplete(30);
        getMacBookPage().clickToAddCartButton();
        getMacBookPage().waitVisibilityOfElement(30, getMacBookPage().getAddToCartPopup());
        getMacBookPage().clickToRemoveProductFromCart();
        getMacBookPage().clickContinueShoppingButton();
        Thread.sleep(3000);
        assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_CART_IN_CART_REMOVED);
    }
}
