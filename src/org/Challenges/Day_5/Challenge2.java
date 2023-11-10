package org.Challenges.Day_5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge2 {

	public static void main(String[] args) {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement confirm = driver.findElement(By.xpath("//a[contains(text(),' & ')]"));
		confirm.click();
		
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btn.click();
		
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		System.out.println(text);
		
		a.accept();
		
		
	}
}
