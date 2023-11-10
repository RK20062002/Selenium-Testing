package org.Challenges.Day_5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge3 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		// prompt alert
		WebElement prompt = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt.click();
		
		Thread.sleep(3000);
		
		WebElement alert = driver.findElement(By.xpath("//button[contains(text(),'prompt')]"));
		alert.click();

		// to switch into the alert
		Alert a = driver.switchTo().alert();

		String text = a.getText();
		System.out.println(text);
		
		a.sendKeys("Ranjith Kumar");
		
		a.accept();
	}
}
