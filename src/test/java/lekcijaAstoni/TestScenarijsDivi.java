package lekcijaAstoni;

import lekcijaAstoni.pageObjects.CartPage;
import lekcijaAstoni.pageObjects.CheckoutPage;
import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import lekcijaSeptini.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarijsDivi extends BaseTest {
    @Test
    public void testCheckoutPageMandatoryFields() {
        System.out.println("1. Navigēt uz saiti https://www.saucedemo.com/");
        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage = new LoginPage(parluks);
        ProductsPage produktuLapa = new ProductsPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

        System.out.println("3. Doties uz grozu");
        CartPage grozaLapa = new CartPage(parluks);
        produktuLapa.getCartButton().click();
        Assert.assertEquals(grozaLapa.getPageTitle().getText(), "YOUR CART");
        System.out.println("4. Doties uz Checkout");
        grozaLapa.getCheckoutButton().click();
        CheckoutPage checkoutLapa = new CheckoutPage(parluks);
        Assert.assertEquals(checkoutLapa.getPageTitle().getText(), "CHECKOUT: YOUR INFORMATION");
        checkoutLapa.clickContinueButton();

        Assert.assertEquals(checkoutLapa.getErrorText(),"Error: First Name is required");

        checkoutLapa.setInputFirstName("Elina");
        checkoutLapa.clickContinueButton();
        Assert.assertEquals(checkoutLapa.getErrorText(),"Error: Last Name is required");
    }

}
