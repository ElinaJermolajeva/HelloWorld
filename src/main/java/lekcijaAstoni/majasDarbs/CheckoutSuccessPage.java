package lekcijaAstoni.majasDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutSuccessPage {
    WebDriver driver;
    WebDriverWait wait;

    public CheckoutSuccessPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private By pageTitle = By.cssSelector("span.title");

    private By backHomeButton = By.id("back-to-products");

    public WebElement getBackHomeButton(){
        return driver.findElement(backHomeButton);
    }
    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }
}
