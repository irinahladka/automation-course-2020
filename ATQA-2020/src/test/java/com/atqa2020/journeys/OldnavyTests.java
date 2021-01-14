package com.atqa2020.journeys;

import com.atqa2020.BaseTest;

import com.atqa2020.pages.GirlsPage;
import com.atqa2020.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OldnavyTests extends BaseTest {

    @BeforeMethod
    public void setup() {
        driver.get("https://oldnavy.gap.com");
    }

    @Test(groups = "main", priority = 0)
    public void mainUrlTest() throws Exception {
        //TODO empty lines, same applies to all methods below
        //Given user opens a browser and provides a valid url

        //When user clicks on the "GIRLS" button

        //And

        //Then user is redirected to the page where the products are for girls
        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Girls')]")).isDisplayed());
    }

    @Test(groups = "main", priority = 1)
    public void firstTest() {

        //TODO note required as this is already declared in BeforeMethod, same applies to all methods below
        //Given user opens a browser and provides a valid url
        driver.get("https://oldnavy.gap.com");
        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Toddler')]")).isDisplayed());
    }
    @Test(groups = "main", priority = 2)
    public void secondTest() {


        //Given user opens a browser and provides a valid url
        driver.get("https://oldnavy.gap.com");
        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/header[1]/div[1]")).isDisplayed());
    }
    @Test(groups = "main", priority = 3)
    public void thirdTest() {


        //Given user opens a browser and provides a valid url
        driver.get("https://oldnavy.gap.com");

        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Masks')]")).isDisplayed());
    }
    @Test(groups = "main", priority = 4)
    public void forthTest() {


        //Given user opens a browser and provides a valid url
        driver.get("https://oldnavy.gap.com");
        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//header/div[1]")).isDisplayed());
    }
}
