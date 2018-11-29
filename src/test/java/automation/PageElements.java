package automation;
import org.openqa.selenium.By;

public class PageElements extends PageFunctions {

    private static By nameRegistrationPage = By.xpath("//input[@name=‘username’]");
    private static By registerEmailField = By.xpath("//input[@name=‘email’]");
    private static By element7 = By.xpath("//div[@id='timeline']//div[@class='hours']//span[7]");
//    private static By emailField = By.xpath(“//input[@id=‘email’]“);
//    private static By passwordField = By.xpath(“//input[@id=‘password’]“);
//    private static By loginButton = By.xpath(“//button[@type=‘submit’]“);
//    private static By logOutButton = By.xpath(“//a[contains(@href,‘logout’)]“);
//    private static By moveOverElement = By.xpath(“//img[@class=‘img-circle’]“);
//    private static By searchField = By.xpath(“//input[@id=‘aa-search-input’]“);
//    private static By dropDownText = By.cssSelector(“a > span”);
//    private static By registrationSameUserAllert = By.xpath(“//div[@class=‘alert alert-success alert-dismissible’]“);


    public static void findAvitar() throws InterruptedException {
        clickOn(registerEmailField);
    }


    public static void readHours(){
        readTime(element7);
    }
}