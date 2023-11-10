package org.Sample.Debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * Debugging is the process of identifying and removing errors from the project
 */

public class Debug {
public static void main(String[] args) {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		// to click create new account
		WebElement newacbtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
		newacbtn.click();
		
		// to click male radio btn
		WebElement malebtn = driver.findElement(By.xpath("(//input[@type='radio'])[2]")); // Exception line
		malebtn.click();
		
		/* Debug steps:-
		 * 
		 * 		set breakpoint --> before exception line double click
		 * 		next --> mouse right click and click debug as
		 * 		next --> fn + f6 line is highlighted and press continue
		 */
}
}
