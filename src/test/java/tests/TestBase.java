package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;


public class TestBase {
    public static WebDriver driver;

    void verifyPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @BeforeMethod
    public void startDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS); deprecated
        WebDriver.Timeouts timeouts = driver.manage().timeouts();
        timeouts.implicitlyWait(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.navigate().to("https://subscribe.jawwy.tv/eg-ar");
        driver.manage().deleteAllCookies();
    }

    //	@AfterTest
    // take screenshot when test case fail and add it in the Screenshot folder
    @AfterMethod //(enabled = false)
    public void stopDriver() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("sessionStorage.clear();"); //localStorage
        driver.quit();
    }
}
