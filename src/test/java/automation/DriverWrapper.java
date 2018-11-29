package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverWrapper {
    public static WebDriver driver = null;
    private static String url = "https://www.darksky.com";

    public static WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void initializeWebDriver(String url) {
        //set chromedriver
        System.setProperty("webdriver.chrome.driver", "C:/Users/AlexLap/Desktop/ClassWork/chromedriver/2.40/chromedriver.exe");
        //Initialize webdriver interface
        driver = new ChromeDriver();
        //1. Goto Facebook homepage
        driver.navigate().to(url);
    }

    @AfterClass
    public void tearDown() {
        //quit the selenium driver
        driver.quit();
    }

}
