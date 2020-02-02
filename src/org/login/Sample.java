package org.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\raj\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
}
}
