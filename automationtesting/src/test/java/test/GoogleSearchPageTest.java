package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {

	
	public static void main(String[] args) {
		
	}
	
	
	public static void googleSearchText() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		GoogleSearchPageObjects searchobj = new GoogleSearchPageObjects(driver);
		driver.get("https://www.google.com");
		searchobj.setTextInSearchBox("abcd");
		searchobj.clickSearchButton();
		
		
		
	}
}
