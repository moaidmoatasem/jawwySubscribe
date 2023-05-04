package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

public class  TestBase {
    public static WebDriver driver ;

    @BeforeMethod
    public void startDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS); deprecated
        WebDriver.Timeouts timeouts = driver.manage().timeouts();
        timeouts.implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://subscribe.jawwy.tv/eg-ar");
    }

//	@AfterTest
    // take screenshot when test case fail and add it in the Screenshot folder
    @AfterMethod (enabled = false)
    public void stopDriver()
    {
        driver.quit();
    }
}
