package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SubscribePage;

public class SubscribePageTest extends TestBase {

    public SubscribePage sp;
    boolean arabicURL;

    @Test(priority = 0)
    public void verifyPageTitle() {
        String actualTitle = driver.getTitle();
        String url = driver.getCurrentUrl();
        arabicURL = url.contains("ar");
        String expectedTitle;
        if (arabicURL) {
            expectedTitle = "جوّي TV | شاهدوا أفلام ومسلسلات أونلاين وبث تلفزيوني مباشر";
        } else {
            expectedTitle = "Jawwy TV | Watch Movies, Series & Live TV - Enjoy Free Trial";
        }
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    //Type & Price and Currency

    @Test
    public void verifyType() {
        sp = new SubscribePage(driver);
        String[] titles = {"لايت", "الأساسية" , "بريميوم"};
        Assert.assertEquals(titles[1],sp.pkgTitles.get(1).getText());
    }

    @Test
    public void verifyPrice(){
        sp = new SubscribePage(driver);
        String[] prices = {"0.25","0.5","1"};
//        sp.enterPackageValue();
//        String secondPKG = sp.pkgPrice.get(1).getText();
//        System.out.println(sp.pkgPrice.get(1).getText());
//        boolean validPrice = secondPKG.contains(prices[1]);
//        Assert.assertTrue(validPrice);

        Assert.assertEquals(prices[0],sp.packagePrice.getText());
    }
    @Test
    public void verifyCurrency(){
        sp = new SubscribePage(driver);
        String expectedCurrency = "دولار أمريكي";
        String actualCurrency = sp.packageCurrency.getText();
        Assert.assertTrue(actualCurrency.contains(expectedCurrency));
    }
}

