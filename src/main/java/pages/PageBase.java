package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Scanner;

public class PageBase {
    protected WebDriver driver;
    //create the Constructor
    public PageBase(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
