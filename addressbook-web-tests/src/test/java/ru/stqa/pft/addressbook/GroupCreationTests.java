package ru.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.time.Duration;

import static org.testng.Assert.fail;

public class GroupCreationTests {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://localhost/addressbook/");
		driver.manage().window().setSize(new Dimension(1008, 696));
		login("admin", "secret");
	}

	private void login(String username, String password) {
		driver.findElement(By.name("user")).sendKeys(username);
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.cssSelector("input:nth-child(7)")).click();
	}

	@Test
	public void testGroupCreation() throws Exception {
		gotoGroupPage();
		initGroupCreation(new GroupData("test6", "test6", "test6"));
		submitGroupCreation();
		returnToGroupPage();
	}

	private void returnToGroupPage() {
		driver.findElement(By.linkText("group page")).click();
	}

	private void submitGroupCreation() {
		driver.findElement(By.name("submit")).click();
	}

	private void gotoGroupPage() {
		driver.findElement(By.name("searchform")).click();
		driver.findElement(By.linkText("groups")).click();
		driver.findElement(By.name("new")).click();
	}

	private void initGroupCreation(GroupData groupData) {
		driver.findElement(By.name("group_name")).click();
		driver.findElement(By.name("group_name")).click();
		driver.findElement(By.name("group_name")).sendKeys(groupData.name());
		driver.findElement(By.name("group_header")).click();
		driver.findElement(By.name("group_header")).sendKeys(groupData.header());
		driver.findElement(By.name("group_footer")).click();
		driver.findElement(By.name("group_footer")).sendKeys(groupData.footer());
	}



	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
