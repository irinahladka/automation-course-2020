package com.atqa2020.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GirlsPage extends Page {

    private String girlsButtonLocator = "//button[contains(text(),'Girls')]";

    public GirlsPage(RemoteWebDriver driver) {
        super(driver);
    }
    }
//TODO I do believe that one curly brace is redundant as well as some lines

}






