package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest {

    @Test
    public void testLoginWrongUsernameAndPassword() {
        testLogin("usususbuib", "oihoiehoho","Epic sadface: Username and password do not match any user in this service");
    }
    @Test
    public void testLoginEmtyUsernameAndPassword() {
        testLogin("", "","Epic sadface: Username is required");
    }
    @Test
    public void testLoginEmptyUsernameAndFilledPassword() {
        testLogin("","pokojij", "Epic sadface: Username is required");
    }
    @Test
    public void testLoginFilledUsernameAndEmptyPassword() {
        testLogin("pogoerhgoeir","","Epic sadface: Password is required");
    }



    private void testLogin(String username, String password, String expectedErrorMessage) {

        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys(username);
        WebElement paroleIevadesLauks = parluks.findElement(By.id("password"));
        paroleIevadesLauks.sendKeys(password);


        WebElement loginPogaIevadesLauks = parluks.findElement(By.id("login-button"));
        loginPogaIevadesLauks.click();

        WebElement errorTextLauks = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextLauks.getText();
        Assert.assertEquals(errorText, expectedErrorMessage);
    }

    @Test
    public void testLoginEmptyUsernameAndPassword() throws InterruptedException {
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys("asasasasasasa");
        //jādzēš ārā, atstāt nevar
        Thread.sleep(5000);

        WebElement paroleIevadesLauks = parluks.findElement(By.id("password"));
        paroleIevadesLauks.sendKeys("asasasasasasa");
        //jādzēš ārā, atstāt nevar
        Thread.sleep(5000);

        WebElement loginPogaIevadesLauks = parluks.findElement(By.id("login-button"));
        loginPogaIevadesLauks.click();

        WebElement errorTextLauks = parluks.findElement(By.cssSelector("div.error-message-container h3"));

        String errorText = errorTextLauks.getText();
        Assert.assertEquals(errorText, "Epic sadface: Username and password do not match any user in this service");

        //TDD - test driven development - uz testiem bāzēta izstrāde

        Thread.sleep(5000);
    }

    //TDD - test driven development - uz testiem bāzēta izstrāde


}
