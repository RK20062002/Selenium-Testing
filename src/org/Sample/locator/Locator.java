package org.Sample.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
}
