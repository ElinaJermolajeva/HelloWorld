package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage  extends BasePage{
    private By cartButton = By.id("shopping_cart_container");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getCartButton(){
        return driver.findElement(cartButton);
    }


    }

