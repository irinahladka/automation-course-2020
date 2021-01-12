package com.atqa2020.framework;

import com.atqa2020.pages.CustomerServicePage;
import com.atqa2020.pages.GirlsPage;
import com.atqa2020.pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Header extends GeneralElements {

    protected RemoteWebDriver driver;

       private String girlsButtonLocator = "//button[contains(text(),'Girls')]";


    public Header(RemoteWebDriver driver) {
        this.driver = driver;
    }

    public Header setSearchTerm(String searchTerm) {
        driver.findElement(By.xpath(girlsButtonLocator)).sendKeys(searchTerm);
        return this;
    }

    public <T extends Page> T clickOnGirlsButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(girlsButtonLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }

    public GirlsPage navigateToGirlsButton() throws Exception {
        driver.findElement(By.xpath(girlsButtonLocator)).click();
        return PageFactory.newPage(driver, GirlsPage.class);
    }
}

