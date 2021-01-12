package com.atqa2020.framework;

import com.atqa2020.pages.CustomerServicePage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Footer extends GeneralElements {

    protected RemoteWebDriver driver;
    private String customerServiceLinkLocator = "//span[contains(text(),'Customer Service')]";
    public Footer(final RemoteWebDriver driver) {
        this.driver = driver;
    }

    public CustomerServicePage navigateToCustomerService() throws Exception {
        driver.findElement(By.xpath(customerServiceLinkLocator)).click();
        return PageFactory.newPage(driver, CustomerServicePage.class);
    }


}
