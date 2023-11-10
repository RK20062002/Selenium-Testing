package org.Sample.Window_Handling;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/* Windows Handling:-
 * 		open new tab from the last web page into new web page
 * 
 * Types :-
 * 		window(url) ---> every time url is changing
 * 		window(title) -->   same
 * 		window(windowsId)
 * 			Parent window Id  --> controlled page	--> getWindowHandle() --> Webdriver interface
 * 			All windows Id	  --> new tab			-->        "		  -->		"      "	
 */

public class windowHandle {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
		searchbar.sendKeys("iphone 13");
		WebElement searchbtn = driver.findElement(By.xpath("//input[@type='submit']"));
		searchbtn.click();
		
		Thread.sleep(3000);
		WebElement iphone = driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 14 (128 GB) - Blue']"));
		iphone.click();
		
		Thread.sleep(3000);
		
		// 3. window(WindowsId)
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Id : "+parentWindowId);
		
		Set<String> allWindowsId = driver.getWindowHandles();
		System.out.println("All Window Id : "+allWindowsId);
		
		for (String winId : allWindowsId) {
			if (winId != parentWindowId) {
				driver.switchTo().window(winId);
			}
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement buy = driver.findElement(By.name("submit.buy-now"));
		
		Object scrolldown = js.executeScript("arguments[0].scrollIntoView(flase)", buy);
		Thread.sleep(2000);
		buy.click();

		Thread.sleep(5000);
		driver.close();
		
	}
}
