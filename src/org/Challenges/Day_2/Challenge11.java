package org.Challenges.Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge11 {

	public static void main(String[] args) {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://www.inmakesedu.com/");
		
		// to print Dubai address
		WebElement add = driver.findElement(By.xpath("//a[contains(text(),'Dubai')]"));
		String address = add.getText();
		System.out.println("Dubai Address : \n"+address);
	}
}
