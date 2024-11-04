package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ApplicationManager {
    WebDriver driver;
    private NavigationHelper navigationHelper;
    private GroupHelper groupHelper;
    private ContactHelper contactHelper;

    public StringBuffer verificationErrors = new StringBuffer();




    public void init() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://localhost/addressbook/");
        driver.manage().window().setSize(new Dimension(1008, 696));
        groupHelper = new GroupHelper(driver);
        navigationHelper = new NavigationHelper(driver);
        contactHelper = new ContactHelper(driver);
        SessionHelper sessionHelper = new SessionHelper(driver);
        sessionHelper.login("admin", "secret");
    }


    public void stop() {
        driver.quit();
    }



    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }
}
