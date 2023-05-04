package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SubscribePage extends PageBase {
    String[] prices = {"0.25","0.5","1"};
    public SubscribePage(WebDriver driver) {
        super(driver);
    }
    //Type & Price and Currency
    public List<WebElement> pkgTitles = driver.findElements(By.className("plan-title"));

    //public List<WebElement> pkgPrice = driver.findElements(By.className("price"));

    final String[] packagesNames =new String[]{"لايت","الأساسية","بريميوم"};
    public WebElement packagePrice = driver.findElement(By.xpath("//*[@id=\"currency-"+ packagesNames[1]+"\"]/b"));

//   public WebElement packageCurrency = driver.findElement(By.xpath("//*[@id=\"currency-"+ packagesNames[1]+"\"]/i/text()["+1+"]"));
//    public WebElement packageCurrency = driver.findElement(By.xpath("//*[@id=\"currency-"+ packagesNames[1]+"\"]/i/text()"));
    public WebElement packageCurrency = driver.findElement(By.xpath("//*[@id=\"currency-"+ packagesNames[1]+"\"]/i"));

}
