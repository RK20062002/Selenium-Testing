package org.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sam5 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
}
