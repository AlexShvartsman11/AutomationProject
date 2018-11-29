package automation;
import org.openqa.selenium.By;

public class PageFunctions extends DriverWrapper {

    public static void clickOn(By locator) throws InterruptedException {
        Thread.sleep(2000);
        DriverWrapper.getDriver().findElement(locator).click();
        Thread.sleep(3000);

    }

    public static void readTime(By locator)
    {
        String x= DriverWrapper.getDriver().findElement(locator).getText();
        System.out.println(x);
    }
}