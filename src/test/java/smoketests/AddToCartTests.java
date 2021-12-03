package smoketests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddToCartTests extends BaseTest {

    private static final String EXPECTED_AMOUNT_OF_PRODUCTS_CART_IN_CART = "1";
    private static final String EXPECTED_AMOUNT_OF_PRODUCTS_CART_IN_CART_MORE_THAT_ONE = "3";

    @Test(priority = 1)
    public void checkAddToCart() {
        getHomePage().clickProductCatalogButton();
        getHomePage().clickAppleStoreButton();
        getAppleStorePage().clickIphoneButton();
        getIphonePage().waitForPageLoadComplete(30);
        getIphonePage().clickToAddCartButton();
        getIphonePage().waitVisibilityOfElement(30, getIphonePage().getAddToCartPopup());
        getIphonePage().clickContinueShoppingButton();
        assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_CART_IN_CART);
    }
    @Test(priority = 2)
    public void checkAddMoreThatOneToCart() throws InterruptedException {
        getHomePage().clickProductCatalogButton();
        getHomePage().clickAppleStoreButton();
        getAppleStorePage().clickMacBookButton();
        getMacBookPage().waitForPageLoadComplete(30);
        getMacBookPage().clickToAddCartButton();
        getMacBookPage().waitVisibilityOfElement(30, getMacBookPage().getAddToCartPopup());
        getMacBookPage().clickContinueShoppingButton();
        getMacBookPage().waitForPageLoadComplete(30);
        getMacBookPage().clickToAddCartButtonNext();
        getMacBookPage().waitVisibilityOfElement(30, getMacBookPage().getAddToCartPopup());
        getMacBookPage().clickToAddCartPlus();
        getMacBookPage().clickContinueShoppingButton();
        Thread.sleep(1000);
        assertEquals(getHomePage().getTextOfAmountProductsInCart(), EXPECTED_AMOUNT_OF_PRODUCTS_CART_IN_CART_MORE_THAT_ONE);
    }
}
