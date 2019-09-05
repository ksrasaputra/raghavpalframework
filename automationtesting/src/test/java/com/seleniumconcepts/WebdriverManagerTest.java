package com.seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * String path=System.getProperty("user.dir");
		 *  System.out.println(path);
		 *  System.setProperty("webdriver.gecko.driver", path+"//drivers//driver.exe");
		 */
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
		driver.quit();
		
		

	}

}
