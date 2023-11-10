package org.Challenges.Day_10;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Challenge1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));	
		search.sendKeys("iphone x");
		
		WebElement searchbtn = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
		searchbtn.click();
		
		Thread.sleep(3000);
		
		WebElement phone = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/719oBAdAl7L._AC_UY218_.jpg']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(phone).perform();
		a.contextClick().perform();
		
		Robot r = new Robot();
		
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			if (i==2) {
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);	
			}
			
		}
		
		Thread.sleep(5000);
		
		String parentId = driver.getWindowHandle();
		System.out.println("Window Id : "+parentId);
		
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("New Window Id : "+allWindow);

		for (String window : allWindow) {
			if (window != parentId) {
				driver.switchTo().window(window);
			}
		}
		
		WebElement price = driver.findElement(By.xpath("(//span[contains(text(),'$129.00')])[2]"));
		String text = price.getText();
		System.out.println(text);
		
		driver.quit();

	}
}
