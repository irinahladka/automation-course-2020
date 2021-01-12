package com.atqa2020.journeys;

import com.atqa2020.BaseTest;
import com.atqa2020.listeners.TestListener;
import com.atqa2020.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.class)
public class HomePageTests extends BaseTest {

    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";
    private HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {

        homePage = new HomePage(driver);
    }


    @Test(groups = "main", suiteName = "ui")
    public void mainPageURLs(Class clazz, String url, String xpath) throws Exception {
        //Given user navigates to the expected page through the header

        //When

        //Then page URL constructed as required
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
    }
}