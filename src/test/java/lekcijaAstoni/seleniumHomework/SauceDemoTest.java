package lekcijaAstoni.seleniumHomework;

import lekcijaAstoni.majasDarbs.*;
import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import java.time.Duration;

public class SauceDemoTest {
   public WebDriver driver;
   WebDriverWait wait;

    @BeforeMethod
    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.saucedemo.com");
    }

    @AfterMethod
    public void tearDownBrowser() {
        driver.quit();
    }

    @Test
    public void testPirmaisScenarijs(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage produktuLapa = new ProductsPage(driver);
        wait.until(ExpectedConditions.visibilityOf(produktuLapa.getPageTitle()));
        Assert.assertEquals(produktuLapa.getPageTitle().getText(),"PRODUCTS");

        WebElement productPageTitle = driver.findElement(By.cssSelector("span.title"));
        String actualPageTitleText = productPageTitle.getText();
        Assert.assertEquals(actualPageTitleText,"PRODUCTS");

        InventoryPage inventoryPage = new InventoryPage(driver);
        Assert.assertEquals(inventoryPage.getPageTitle().getText(), "PRODUCTS");
        inventoryPage.getAddToCartBackpackButton().click();

        Assert.assertEquals(inventoryPage.getCartButton().getText(), "1");
        inventoryPage.getCartButton().click();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getPageTitle().getText(), "YOUR CART");
        cartPage.getCheckoutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputFirstName("Anna");
        checkoutPage.inputLastNameField("Berzina");
        checkoutPage.inputPostalCodeField("LV5401");
        checkoutPage.clickContinueButton();

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        Assert.assertEquals(checkoutOverviewPage.getInventoryItemName().getText(), "Sauce Labs Onesie");
        checkoutOverviewPage.getFinishButton().click();

        CheckoutSuccessPage checkoutSuccessPage = new CheckoutSuccessPage(driver);
        Assert.assertEquals(checkoutSuccessPage.getPageTitle().getText(), "CHECKOUT: COMPLETE!");
        checkoutSuccessPage.getBackHomeButton().click();
    }

    @Test
    public void testOtraisScenarijs(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.getCartButton().click();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getCheckoutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");

        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(),"Error: First Name is required");

        checkoutPage.inputFirstName("Anna");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(), "Error: Last Name is required");

        checkoutPage.inputLastNameField("Bērziņa");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(), "Error: Postal Code is required");

        checkoutPage.inputPostalCodeField("LV5401");
        checkoutPage.clickContinueButton();

    }
}






