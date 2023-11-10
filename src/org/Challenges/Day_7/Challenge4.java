package org.Challenges.Day_7;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge4 {

	public static void main(String[] args) throws IOException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	
		JavascriptExecutor js =(JavascriptExecutor) driver; // syntax for object creation interface
		
		WebElement email = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','rk@gmail.com')", email); // syntax for enter value using js execute script
		
		
		WebElement password = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','rk20062002')", password);	// syntax for enter value using js execute script
		
		
		WebElement btn = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click()", btn);	// syntax for click btn using js execute script
	
	}
}
