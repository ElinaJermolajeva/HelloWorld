package lekcijaAstoni.majasDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverviewPage {
    WebDriver driver;
    WebDriverWait wait;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    private By inventoryItemName = By.className("inventory_item_name");
    private By finishButton = By.id("finish");


    public WebElement getFinishButton(){
        return driver.findElement(finishButton);
    }
    public WebElement getInventoryItemName() {
        return driver.findElement(inventoryItemName);
    }


}
