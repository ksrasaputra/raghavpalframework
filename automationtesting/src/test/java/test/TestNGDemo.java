package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class TestNGDemo {

	WebDriver driver = null;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Test
	public void googleSearch() {

		driver.get("https://www.google.com");

		/*
		 * * GoogleSearchPageObjects searchobj = new GoogleSearchPageObjects(driver);
		 * 
		 * searchobj.setTextInSearchBox("abcd"); searchobj.clickSearchButton();
		 */

		driver.findElement(By.name("q")).sendKeys("abcd");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
