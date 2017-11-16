package com.revature.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	private String baseUrl;
	private WebDriver driver;

	
	@Before
	public void openBrowser() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			baseUrl = "http://www.google.com";
			driver = new ChromeDriver();
			driver.get(baseUrl);
		}	
	}
	
	@After
	public void closeBrowser() {
		driver.quit();
	}
	
	@Test
	public void WebDriverTest() throws InterruptedException {
		openBrowser();
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("jenkins");
		System.out.println(driver.getTitle());
		searchField.submit();
		Thread.sleep(5000);
	}

}
