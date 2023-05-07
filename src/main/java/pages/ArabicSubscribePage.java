package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;

public class ArabicSubscribePage extends PageBase {

    public ArabicSubscribePage(WebDriver driver) {
        super(driver);
    }
    //Type & Price and Currency

    //public List<WebElement> pkgPrice = driver.findElements(By.className("price"));

    public String[] packagesArNames = new String[]{"لايت", "الأساسية", "بريميوم"};
    public WebElement langBtn = driver.findElement(By.id("translation-btn"));
    public WebElement pkgArTitles = driver.findElement(By.id("name-" + packagesArNames[1]));

    public WebElement packageArPrice = driver.findElement(By.xpath("//*[@id=\"currency-" + packagesArNames[1] + "\"]/b"));
    public WebElement packageArCurrency = driver.findElement(By.xpath("//*[@id=\"currency-" + packagesArNames[1] + "\"]/i"));

    //todo -- adding hashmap instead of hardcoded values for packages
    // Create a HashMap object called TV Packages
    /*
    public HashMap<String, String> tvPackages = new HashMap<>();
    // Add keys and values (English Packages, Arabic Packages)
    public void addTvPackages() {
        // Convert the Arabic words to strings
        String lite = "لايت";
        String classic = "كلاسيك";
        String premium = "بريمويم";
        // Add the keys and values to the Map
        tvPackages.put("LITE", lite);
        tvPackages.put("CLASSIC", classic);
        tvPackages.put("PREMIUM", premium);
    }

    public HashMap<String, String> getTvPackages() {
        return tvPackages;
    }
*/
}
