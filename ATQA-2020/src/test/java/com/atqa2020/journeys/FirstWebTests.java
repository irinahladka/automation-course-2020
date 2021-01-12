package com.atqa2020.journeys;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstWebTests {
    private RemoteWebDriver driver;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 0, suiteName = "main")
    public void mainUrlTest() {


        //Given user opens a browser and provides a valid url
        driver.get("https://oldnavy.gap.com");
        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Girls')]")).isDisplayed());
    }
    @Test(priority = 1, suiteName = "main")
    public void firstTest() {


        //Given user opens a browser and provides a valid url
        driver.get("https://oldnavy.gap.com");
        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Toddler')]")).isDisplayed());
    }
    @Test(priority = 2, suiteName = "main")
    public void secondTest() {


        //Given user opens a browser and provides a valid url
        driver.get("https://oldnavy.gap.com");
        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/header[1]/div[1]")).isDisplayed());
    }
    @Test(priority = 3, suiteName = "main")
    public void thirdTest() {


        //Given user opens a browser and provides a valid url
        driver.get("https://oldnavy.gap.com");

        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//button[contains(text(),'Masks')]")).isDisplayed());
    }
    @Test(priority = 4, suiteName = "main")
    public void forthTest() {


        //Given user opens a browser and provides a valid url
        driver.get("https://oldnavy.gap.com");
        //When user clicks enter

        //And

        //Then user is redirected to the main page
        Assert.assertTrue(driver.findElement(By.xpath("//header/div[1]")).isDisplayed());
    }
}
