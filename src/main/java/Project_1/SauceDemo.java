package Project_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertEquals;

public class SauceDemo {
    WebDriver driver;


    public SauceDemo(WebDriver driver) {
        this.driver = driver;
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By Username = By.id("user-name");
    By Password = By.id("password");
    By Login = By.id("login-button");
    By Item1 = By.id("add-to-cart-sauce-labs-backpack");
    By Item2 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By Item3 = By.id("add-to-cart-sauce-labs-onesie");
    By Verify = By.className("shopping_cart_badge");
    By Cart = By.cssSelector("[data-test=\"shopping-cart-link\"]");
    By price1 = By.xpath("//div[3]//div[2]//div[2]//div[1]");
    By price2 = By.xpath("//div[4]//div[2]//div[2]//div[1]");
    By price3 = By.xpath("//div[5]//div[2]//div[2]//div[1]");
    By remove = By.id("remove-sauce-labs-onesie");
    By checkout = By.id("checkout");
    By Firstname = By.id("first-name");
    By Lastname = By.id("last-name");
    By zipcode = By.id("postal-code");
    By Continue = By.id("continue");
    By errorMessage = By.xpath("//div[@class='error-message-container error']");
    By subtotal = By.xpath("//div[@class='summary_subtotal_label']");
    By TotalPrice = By.xpath("//div[@class='summary_total_label']");
    By Tax = By.className("summary_tax_label");
    By FinishButton = By.id("finish");
    By successMessage = By.cssSelector("h2[class=\"complete-header\"]");
    By backButton = By.id("back-to-products");

    public void VisitWebsite() {

        WebElement username = driver.findElement(Username);
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(Password);
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(Login);
        login.click();
    }

    public void AddItemOne() {
        driver.findElement(Item1).click();
        assertEquals("1", driver.findElement(Verify).getText());
        System.out.println(driver.findElement(Verify).getText());
    }

    public void AddItemTwo() {
        driver.findElement(Item2).click();
        assertEquals("2", driver.findElement(Verify).getText());
        System.out.println(driver.findElement(Verify).getText());
    }

    public void AddItemThree() {
        driver.findElement(Item3).click();
        assertEquals("3", driver.findElement(Verify).getText());
        System.out.println(driver.findElement(Verify).getText());
    }

    public void clickOnCart() {
        driver.findElement(Cart).click();
    }

    //selected items are present with their respective prices.
    public void verifyItem1Price() {
        assertEquals("$29.99", driver.findElement(price1).getText());
        System.out.println(driver.findElement(price1).getText());
    }

    public void verifyItem2Price() {
        assertEquals("$15.99", driver.findElement(price2).getText());
        System.out.println(driver.findElement(price2).getText());
    }

    public void verifyItem3Price() {
        assertEquals("$7.99", driver.findElement(price3).getText());
        System.out.println(driver.findElement(price3).getText());
    }

    public void clickOnRemoveItem3() {
        driver.findElement(remove).click();
        assertEquals("2", driver.findElement(Verify).getText());
        System.out.println(driver.findElement(Verify).getText());
    }

    public void clickOnCheckout() {
        driver.findElement(checkout).click();
    }

    public void checkOutInformation() {
        driver.findElement(Continue).click();
        assertEquals("Error: First Name is required", driver.findElement(errorMessage).getText());
        System.out.println(driver.findElement(errorMessage).getText());
        driver.findElement(Firstname).sendKeys("Albert");
        driver.findElement(Continue).click();
        assertEquals("Error: Last Name is required", driver.findElement(errorMessage).getText());
        System.out.println(driver.findElement(errorMessage).getText());
        driver.findElement(Lastname).sendKeys("Smith");
        driver.findElement(Continue).click();
        assertEquals("Error: Postal Code is required", driver.findElement(errorMessage).getText());
        System.out.println(driver.findElement(errorMessage).getText());
        driver.findElement(zipcode).sendKeys("12345");
        driver.findElement(Continue).click();
    }

    public void verifyPriceItems() {
        double item1 = 29.99;
        double item2 = 15.99;

        double sum = item1 + item2;
        System.out.println("Item total: $" + sum);
        assertEquals("Item total: $45.98", driver.findElement(subtotal).getText());
    }

    public void verifyTaxAndTotal() {
        double sum = 45.99;
        double tax = 4.32;
        double total = sum + tax;
        System.out.println("Total: $" + total);
        assertEquals("Total: $49.66", driver.findElement(TotalPrice).getText());
        System.out.println(driver.findElement(Tax).getText());
    }

    public void clickOnFinish() {
        driver.findElement(FinishButton).click();
    }

    public void successMessage() throws InterruptedException {
        //Thread.sleep(5000);
        WebElement element = driver.findElement(successMessage);
        String myText = element.getText();
        System.out.println(myText);
    }

    public void verifyTheCart() {
        if (Cart.equals(0)) {
            throw new AssertionError("Cart is empty");
        } else {
            System.out.println("Cart is not empty");
        }

    }
}





