package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EnglishSubscribePage extends PageBase {

    public EnglishSubscribePage(WebDriver driver) {
        super(driver);
    }
    //Type & Price and Currency

    //public List<WebElement> pkgPrice = driver.findElements(By.className("price"));

    public String[] packagesEnNames = new String[]{"lite", "classic", "premium"};

    public WebElement pkgEnTitles = driver.findElement(By.id("name-" + packagesEnNames[1]));

    public WebElement packageEnPrice = driver.findElement(By.xpath("//*[@id=\"currency-" + packagesEnNames[1] + "\"]/b"));

    public WebElement packageEnCurrency = driver.findElement(By.xpath("//*[@id=\"currency-" + packagesEnNames[1] + "\"]/i"));

}
