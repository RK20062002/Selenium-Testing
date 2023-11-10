package org.Sample.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathTextLocator {
	/*
	 * does not contain attribute
	 * place between two tag
	 * black color "..."
	 * 
	 * syntax :-
	 * 		//tagName[text()='black color text value']
	 */
	public static void main(String[] args) {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// to find new account button web element
		WebElement newid = driver.findElement(By.xpath("//a[text()='Create new account']"));
		newid.click();
	}
}
