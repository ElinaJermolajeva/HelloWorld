package lekcijaAstoni.majasDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private By pageTitle = By.className("title");
    private By checkoutButton = By.id("checkout");

    public WebElement getCheckoutButton(){
        return driver.findElement(checkoutButton);
    }
    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }

}
