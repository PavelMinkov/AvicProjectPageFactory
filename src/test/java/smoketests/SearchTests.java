package smoketests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchTests extends BaseTest {

    private static final String SEARCH_KEYWORD = "Samsung Galaxy";
    private static final String SEARCH_QUERY = "Samsung+Galaxy";
    private static final int COUNT_ELEMENTS = 12;
    private static final String SEARCH_BRAND = "ASUS";
    private static final String SEARCH_MODEL = "Series 6";

    @Test(priority = 1)
    public void checkThatUrlContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        assertTrue(getDriver().getCurrentUrl().contains(SEARCH_QUERY));
    }

    @Test(priority = 2)
    public void checkElementsAmountOnSearchPage() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getHomePage().implicitWait(30);
        assertEquals(getSearchResultsPage().getSearchResultsCount(), COUNT_ELEMENTS);
    }

    @Test(priority = 3)
    public void checkThatSearchResultsContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        for (WebElement webElements : getSearchResultsPage().getSearchResultsList()) {
            assertTrue(webElements.getText().contains(SEARCH_KEYWORD));
        }
    }

    @Test(priority = 4)
    public void checkThatBrandContainsSearchBrand() {
        getHomePage().clickBrandButton();
        getBrandAsusPage().clickShowMoreSmartphones();
        for (WebElement webElements : getSearchResultsPage().getSearchResultsList()) {
            assertTrue(webElements.getText().contains(SEARCH_BRAND));
        }
    }

    @Test(priority = 5)
    public void checkThatCheckBoxResultsContainsSearchWord() {
        getHomePage().clickProductCatalogButton();
        getHomePage().clickAppleStoreButton();
        getAppleStorePage().clickAppleWatchPage();
        getAppleWatchPage().clickCheckBox();
        for (WebElement webElement: getSearchResultsPage().getSearchResultsList()){
            assertTrue(webElement.getText().contains(SEARCH_MODEL));
        }
    }
}