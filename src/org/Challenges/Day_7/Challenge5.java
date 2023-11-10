package org.Challenges.Day_7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge5 {

	public static void main(String[] args) throws IOException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement name = driver.findElement(By.id("username"));
		
		Object user = js.executeScript("arguments[0].setAttribute('value','ranjith')", name);
		
		WebElement password = driver.findElement(By.name("password"));
		
		Object pass = js.executeScript("arguments[0].setAttribute('value','ranjith2002')", password);
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		
		Object btn = js.executeScript("arguments[0].click()", login);
			
	}
}
