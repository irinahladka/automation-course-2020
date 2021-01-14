package com.atqa2020.pages;

import com.atqa2020.framework.Footer;
import com.atqa2020.framework.Header;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends Page {

    private Header header;
    private Footer footer;
    //TODO empty lines

    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
        this.footer = new Footer(driver);
    }

    public CustomerServicePage navigateToCustomerService() throws Exception {
        return footer.navigateToCustomerService();
    }

    public <T extends Page> T searchForItem(Class<T> clazz, String searchTerm) throws Exception {
        return header.setSearchTerm(searchTerm).clickOnGirlsButton(clazz);
    }
    //TODO it feels like this method should be navigateToGirlsPage()
    public GirlsPage navigateToGirlsButton() throws Exception {
        return header.navigateToGirlsButton();

    }
}

