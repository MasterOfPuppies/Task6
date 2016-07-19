import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class1 {

//    private static final By INPUT_USERNAME_CSS = By.cssSelector("#Username");
//    private static final By INPUT_PASSWORD_CSS = By.cssSelector("#Password");
//    private static final By LOGIN_CSS = By.cssSelector("#SubmitButton");
//    private static final By SIGNOUT_CSS = By.cssSelector(".sign-out-span>a");
    private static final By I_A = By.cssSelector("input, link");
    private static final By I_B = By.cssSelector("*");
    private static final By I_C = By.cssSelector("a[class='name']~div");
    private static final By I_D = By.cssSelector("ol[class*='officeShortInfo'] li:first-child>a");
    private static final By I_E = By.cssSelector("ol[class*='officeShortInfo'] li:nth-last-child(2)>a");
    private static final By I_F = By.cssSelector("ol[class*='officeShortInfo'] li:nth-child(4)>a");
    private static final By I_G = By.cssSelector("ol[class*='officeShortInfo'] li:nth-child(5n+3)>a");
    private static final By I_H = By.cssSelector("div[id='vacation'] input:not(#EditVacationRequestStartDate)");
    private static final By II_A = By.xpath("//link | //input");
    private static final By II_B = By.xpath(".//*");
    private static final By II_C = By.xpath("//div[@id='info']/div");
    private static final By II_D = By.xpath("//ol[contains(@class,'officeShortInfo')]/li[1]/a");
    private static final By II_E = By.xpath("//ol[contains(@class,'officeShortInfo')]/li[24]/a");
    private static final By II_F = By.xpath("//ol[contains(@class,'officeShortInfo')]/li[4]/a");
    private static final By II_G = By.xpath("//ol[contains(@class,'officeShortInfo')]/li[position()<5]/a");
    private static final By II_H = By.xpath("//@class");
    private static final By II_I = By.xpath("//*[starts-with(@class,'widget')]");
    private static final By II_J = By.xpath("//*[contains(@id,'wrapper')]");
    private static final By II_K = By.xpath("//*[contains(@data-officeid,'b')]");
    private static final By II_L = By.xpath("//*[contains(text(),'Management Belarus')]");
    private static final By II_M = By.xpath("//span[text()=\"2\"]/parent::*/preceding-sibling::a");


    private static WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://192.168.100.26/");

    }

    @AfterClass
    public void tearDown(){
        driver.close();

    }

    @Test
    public void testMethod() throws InterruptedException {
//
//        WebElement inputUsername = driver.findElement(INPUT_USERNAME_CSS);
//        WebElement inputPassword = driver.findElement(INPUT_PASSWORD_CSS);
//        WebElement loginButton = driver.findElement(LOGIN_CSS);
//
//
//        inputUsername.sendKeys("EugenBorisik");
//        inputPassword.sendKeys("1");
//        loginButton.click();
//        Assert.assertTrue(driver.findElement(SIGNOUT_CSS).isDisplayed());

        Thread.sleep(2000);
    }

}
