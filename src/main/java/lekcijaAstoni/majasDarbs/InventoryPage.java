package lekcijaAstoni.majasDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InventoryPage {
    WebDriver driver;
    WebDriverWait wait;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private By pageTitle = By.cssSelector("span.title");

    private By cartButton = By.id("shopping_cart_container");

    private By addToCartOnesieButton = By.id("add-to-cart-sauce-labs-onesie");


    public WebElement getAddToCartBackpackButton() {
        return driver.findElement(addToCartOnesieButton);
    }
    public WebElement getCartButton(){
        return driver.findElement(cartButton);
    }
    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }

}
