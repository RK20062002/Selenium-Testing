package org.Sample.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*Alert :-
 * 		Alert has no locators
 * 		Syntax :-
 * 			driver.switchTo().alert();
 * 
 * 		Types :-  			---->  	Methods :-
 * 			simple						accept()
 * 			confirm						dismiss()
 * 			prompt						sendKeys() , getText()
 * 
 */

public class Alert1 {

	public static void main(String[] args) {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();

		// simple alert
		WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alert.click();
		
		// to switch into the alert
		Alert a = driver.switchTo().alert();
		
		// get the text from the alert
		String eg = a.getText();
		System.out.println(eg);
		
	}
}
