package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {
    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillContactForm(String michael, String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String home, String mobile, String work, String fax, String email, String email2, String email3, String homepage, String day, String month, String year, String aday, String amonth, String ayear, String group, String adress2, String phone2, String Notes) {
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("middlename")).sendKeys(middlename);
        driver.findElement(By.name("lastname")).sendKeys(lastname);
        driver.findElement(By.name("nickname")).sendKeys(nickname);
        driver.findElement(By.name("title")).sendKeys(title);
        driver.findElement(By.name("company")).sendKeys(company);
        driver.findElement(By.name("address")).sendKeys(address);
        driver.findElement(By.name("home")).sendKeys(home);
        driver.findElement(By.name("mobile")).sendKeys(mobile);
        driver.findElement(By.name("work")).sendKeys(work);
        driver.findElement(By.name("fax")).sendKeys(fax);
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("email2")).sendKeys(email2);
        driver.findElement(By.name("email3")).sendKeys(email3);
        driver.findElement(By.name("homepage")).sendKeys(homepage);
        driver.findElement(By.name("bday")).click();
        new Select(driver.findElement(By.name("bday")));
        click(By.xpath(day));
        driver.findElement(By.name("bmonth")).click();
        new Select(driver.findElement(By.name("bmonth")));
        click(By.xpath(month));
        driver.findElement(By.name("byear")).sendKeys(year);
        driver.findElement(By.name("aday")).click();
        new Select(driver.findElement(By.name("aday")));
        click(By.xpath(aday));
        driver.findElement(By.name("amonth")).click();
        new Select(driver.findElement(By.name("amonth")));
        click(By.xpath(amonth));
        driver.findElement(By.name("ayear")).sendKeys(ayear);
        driver.findElement(By.name("new_group")).click();
        new Select(driver.findElement(By.name("new_group")));
        click(By.xpath(group));
        driver.findElement(By.name("address2")).sendKeys(adress2);
        driver.findElement(By.name("phone2")).sendKeys(phone2);
        driver.findElement(By.name("notes")).sendKeys(Notes);
    }

    public void AddNewContactSubmit() {
        driver.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    private class Select {
        public Select(SearchContext bday) {
        }

        public void selectByVisibleText(String day) {
        }
    }
}
