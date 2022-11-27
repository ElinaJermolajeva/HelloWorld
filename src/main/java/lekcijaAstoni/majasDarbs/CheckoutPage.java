package lekcijaAstoni.majasDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage {
    WebDriver driver;
    WebDriverWait wait;

    private By pageTitle = By.className("title");

    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");

    private By lastNameInputField = By.id("last-name");

    private By postalCodeInputField = By.id("postal-code");

    public void inputPostalCodeField(String kods){
        driver.findElement(postalCodeInputField).sendKeys(kods);
    }
    public void inputLastNameField(String uzvards){
        driver.findElement(lastNameInputField).sendKeys(uzvards);
    }
    public void inputFirstName(String vards){
        driver.findElement(firstNameInputField).sendKeys(vards);
    }

    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }
    public WebElement getPageTitle() {
        return driver.findElement(pageTitle);
    }
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}
