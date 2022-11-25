package lekcijaSeptini.labDarbs;

import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.annotation.Repeatable;

public class SauceDemoLoginTest extends BaseTest {

    @Test
    public void testLoginPageObjectExample(){
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("giuhuhuiu", "ggkffiugi");
        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username and password do not match any" +
                "user in this service");
    }
    @Test
    public void testLoginWrongUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("giuhuhuiu", "ggkffiugi");
        Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Username and password do not match any" +
                "user in this service");
    }

    @Test public void testLoginEmptyUsernameAndPassword(){
            LoginPage loginPage = new LoginPage(parluks);
            loginPage.login("", "");
            Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username is required");
        }

    @Test
    public void testLoginEmptyUsernameAndFilledPassword() {
            LoginPage loginPage = new LoginPage(parluks);
            loginPage.login("", "ggkffiugi");
            Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username is required");
    }
    @Test
    public void testLoginFilledUsernameAndEmptyPassword() {
            LoginPage loginPage = new LoginPage(parluks);
            loginPage.login("giuhuhuiu", "");
            Assert.assertEquals(loginPage.getErrorText(), "Epic sadface: Password is required");
        }
@Test
    public void testSuccessfulLogin(){
    LoginPage loginPage = new LoginPage(parluks);
    loginPage.login("standard_user", "secret_sauce");
    ProductsPage produktuLapa = new ProductsPage(parluks);
    wait.until(ExpectedConditions.visibilityOf(produktuLapa.getPageTitle()));
    Assert.assertEquals(produktuLapa.getPageTitle().getText(),"PRODUCTS");
}


    }

    //TDD - test driven development - uz testiem bāzēta izstrāde



