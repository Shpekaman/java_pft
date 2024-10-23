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
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.get("http://localhost/addressbook/");
		driver.manage().window().setSize(new Dimension(1008, 696));
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("secret");
		driver.findElement(By.cssSelector("input:nth-child(7)")).click();
		driver.findElement(By.name("searchform")).click();
		driver.findElement(By.linkText("groups")).click();
		driver.findElement(By.name("new")).click();
		driver.findElement(By.name("group_name")).click();
		driver.findElement(By.name("group_name")).click();
		driver.findElement(By.name("group_name")).sendKeys("test6");
		driver.findElement(By.name("group_header")).click();
		driver.findElement(By.name("group_header")).sendKeys("test6");
		driver.findElement(By.name("group_footer")).click();
		driver.findElement(By.name("group_footer")).sendKeys("test6");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.linkText("group page")).click();
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
