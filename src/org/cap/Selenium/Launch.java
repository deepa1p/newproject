package org.cap.Selenium;

import org.openqa.selenium.WebDriver;

import java.lang.*;

public class Launch {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\raj\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
	}

}
