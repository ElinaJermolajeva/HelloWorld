package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {

    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");
    private By firstNameInputField = By.id("first-name");

    public CheckoutPage(WebDriver parluks) {
        super(parluks);
    }

    public void setInputFirstName(String a){

        driver.findElement(firstNameInputField).sendKeys("name");
    }

    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }

}
