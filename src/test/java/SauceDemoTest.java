import Project_1.SauceDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceDemoTest {
    static WebDriver driver;

    @BeforeClass
    public static void BeforeTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options);
    }

    @Test
    public void sauceDemo() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        SauceDemo sauceDemo = new SauceDemo(driver);
        sauceDemo.VisitWebsite();
        sauceDemo.AddItemOne();
        sauceDemo.AddItemTwo();
        sauceDemo.AddItemThree();
        sauceDemo.clickOnCart();
        sauceDemo.verifyItem1Price();
        sauceDemo.verifyItem2Price();
        sauceDemo.verifyItem3Price();
        sauceDemo.clickOnRemoveItem3();
        sauceDemo.clickOnCheckout();
        sauceDemo.checkOutInformation();
        sauceDemo.verifyPriceItems();
        sauceDemo.verifyTaxAndTotal();
        sauceDemo.clickOnFinish();
        sauceDemo.successMessage();
        sauceDemo.verifyTheCart();
    }
}
