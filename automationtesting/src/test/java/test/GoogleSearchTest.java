package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleSearchPage;


public class GoogleSearchTest {

	
	public static void main(String[] args) {
		
		
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		GoogleSearchPage.textbox_serach(driver).sendKeys("automation step by step");
		GoogleSearchPage.button_serach(driver).sendKeys(Keys.RETURN);
		
		System.out.println(driver.getTitle());
		driver.close();
	}
}
