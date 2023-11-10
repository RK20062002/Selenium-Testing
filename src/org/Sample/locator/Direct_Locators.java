package org.Sample.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Direct_Locators {
	
	public static void main(String[] args) {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		// 4. to find email web element
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("9715435855");
		
		// 5. to find password web element
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("rk20062002");
		
		// 6. to find login web element
		WebElement login = driver.findElement(By.name("login"));
		login.click();
	}

}
