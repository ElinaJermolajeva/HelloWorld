package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class TestSearch extends BaseTest {
    @Test
    public void testSearchFunctionality() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("apelsīni");

        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        List<WebElement> searchResultList = searchResultsPage.getSearchResultList();
        Assert.assertEquals(searchResultList.size(),6);

        mainPage.searchProduct("burkāni");
        searchResultList = searchResultsPage.getSearchResultList();
        Assert.assertEquals(searchResultList.size(),23);


        // Map<String,Integer> = Map.of("apelsīni",6);

       // List<Map<String, Integer>> searchAndResultList = List.of(
        //        Map.of("apelsīni",6);
        //        Map.of("aboli",3);)

    }
    @Test
    public void testRegistrationWindowClosesCorrectly() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("b-mui-carousel--placeholder")));
        mainPage.clickSignInButtton();
        Thread.sleep(5000);

        SignInModal signInModal = new SignInModal(driver);
        signInModal.waitForSignInModalToAppear();

        signInModal.closeButtonClick();
        signInModal.waitForSignInModalToDisappear();

        Assert.assertEquals(signInModal.getModalWindow().size(),0);
    }
}
