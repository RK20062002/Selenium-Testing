package org.Sample.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ContainsXpath {
	/*
	 * Contains Xpath Syntax :-
	 * 
	 * 		//tagname[contains(text(), 'partial text')]
	 */
	
	public static void main(String[] args) {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// to get text from the web page
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String fbtext = text.getText();
		System.out.println("The Fb Text is : "+fbtext);
	}
}
