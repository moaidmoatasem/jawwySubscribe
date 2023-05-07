package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ArabicSubscribePage;
import pages.EnglishSubscribePage;
import pages.LaunchSubscribePage;

import static org.testng.Assert.fail;

public class SubscribePageTest extends TestBase {

    public LaunchSubscribePage launchSubscribePage;
    public ArabicSubscribePage arabicSubscribePage;
    public EnglishSubscribePage englishSubscribePage;

    public boolean isArabicURL() {
        return driver.getCurrentUrl().contains("ar");

    }

    @Test
    public void verify_page_title() {
        String expectedTitle;
        if (isArabicURL()) {
            expectedTitle = "جوّي TV | شاهدوا أفلام ومسلسلات أونلاين وبث تلفزيوني مباشر";
        } else {
            expectedTitle = "Jawwy TV | Watch Movies, Series & Live TV - Enjoy Free Trial";
        }

        try {
            Assert.assertEquals(expectedTitle, driver.getTitle());
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            fail("Assertion failed");
        }
    }
    //Type & Price and Currency

    @Test
    public void verify_package_type() {
        launchSubscribePage = new LaunchSubscribePage(driver);
        if (isArabicURL()) {
            arabicSubscribePage = new ArabicSubscribePage(driver);
            try {
                Assert.assertEquals(arabicSubscribePage.pkgArTitles.getText(), arabicSubscribePage.packagesArNames[1]);
            } catch (AssertionError e) {
                System.out.println("Assertion failed: " + e.getMessage());
                fail("Assertion failed");
            }
        }
        //        asp.langBtn.click();
        else {
            englishSubscribePage = new EnglishSubscribePage(driver);
            try {
                Assert.assertEquals(englishSubscribePage.pkgEnTitles.getText(), englishSubscribePage.packagesEnNames[1].toUpperCase());
            } catch (AssertionError e) {
                System.out.println("Assertion failed: " + e.getMessage());
                fail("Assertion failed");
            }
        }
    }

    @Test
    public void verify_package_price() {
        launchSubscribePage = new LaunchSubscribePage(driver);
        //price shows in English for both versions, no need for if-else separate checks
        String[] expectedPrices = {"0.25", "0.5", "1"};
        if (isArabicURL()) {
            arabicSubscribePage = new ArabicSubscribePage(driver);
            try {
                Assert.assertEquals(arabicSubscribePage.packageArPrice.getText(), expectedPrices[1]);
            } catch (AssertionError e) {
                System.out.println("Assertion failed: " + e.getMessage());
                fail("Assertion failed");
            }
        } else {
//        asp.langBtn.click();
            englishSubscribePage = new EnglishSubscribePage(driver);
            try {
                Assert.assertEquals(englishSubscribePage.packageEnPrice.getText(), expectedPrices[1]);
            } catch (AssertionError e) {
                System.out.println("Assertion failed: " + e.getMessage());
                fail("Assertion failed");
            }
        }
    }

    @Test
    public void verify_package_currency() {
        launchSubscribePage = new LaunchSubscribePage(driver);
        String expectedArCurrency = "دولار أمريكي";
        String expectedEnCurrency = "USD";
        String actualCurrency;
        if (isArabicURL()) {
            arabicSubscribePage = new ArabicSubscribePage(driver);
            try {
                actualCurrency = arabicSubscribePage.packageArCurrency.getText();
                Assert.assertTrue(actualCurrency.contains(expectedArCurrency));
            } catch (AssertionError e) {
                System.out.println("Assertion failed: " + e.getMessage());
                fail("Assertion failed");
            }
        } else {
//        asp.langBtn.click();
            englishSubscribePage = new EnglishSubscribePage(driver);
            try {
                actualCurrency = englishSubscribePage.packageEnCurrency.getText();
                Assert.assertTrue(actualCurrency.contains(expectedEnCurrency));
            }  catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            fail("Assertion failed");
        }
    }
}
}