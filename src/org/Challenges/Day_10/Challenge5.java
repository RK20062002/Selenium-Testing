package org.Challenges.Day_10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement searchbar = driver.findElement(By.name("q"));
		searchbar.sendKeys("mask");
		WebElement searchbtn = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
		searchbtn.click();
		WebElement mask = driver.findElement(By.xpath("(//img[@class='_396cs4'])[2]"));
		mask.click();
		
		String parentwindow = driver.getWindowHandle();
		Set<String> newWindow = driver.getWindowHandles();
		for (String window : newWindow) {
			if (window != parentwindow) {
				driver.switchTo().window(window);
			}
		}
		
		WebElement pincode = driver.findElement(By.id("pincodeInputId"));
		pincode.sendKeys("620004");
		
		
	}
}
