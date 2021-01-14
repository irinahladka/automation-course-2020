package com.atqa2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CustomerServicePage extends Page{
        //TODO please remove redundant empty lines

        private static String CONTACT_PAGE_TITLE = "Top Customer Questions";
        private String contactPageTitleLocator = "//div[@class=\"contentHeadTop\"]";

        public CustomerServicePage(RemoteWebDriver driver) {
            super(driver);
        }

        public boolean isTitleCorrect() {
            return driver.findElement(By.xpath(contactPageTitleLocator)).getText().equals(CONTACT_PAGE_TITLE);
        }
}
