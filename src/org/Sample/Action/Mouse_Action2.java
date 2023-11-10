package org.Sample.Action;

// ****************** Drag and drop Action ***************** //

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action2 {

	public static void main(String[] args) {

		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");

		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();

		// 3. Launch the URL
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// Action method
		Actions a = new Actions(driver);
		
		// to find web element for bank
		WebElement bank = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		// to find web element for debit side
		WebElement debt = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bank, debt).perform();
		
		// to find web element for sales
		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		// to find web element for credit side
		WebElement credit = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(sales, credit).perform();
		
		// to find web element for 5000
		WebElement bankamt = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		
		// to find web element for amount side
		WebElement amt1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bankamt, amt1).perform();
		
		// to find web element for 5000
		WebElement salesamt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		// to find web element for amount side
		WebElement amt2 = driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(salesamt, amt2).perform(); 
	}
}
