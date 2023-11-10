package org.Sample.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

/* Frames :-
 * 		horizontally or vertically divided and use different code
 * 
 * iFrame :-
 * 		html inside another html page.
 * 
 * Switch to frame :-
 * 		switchTo().frame(string id)
 * 		switchTo().frame(string name)
 * 		switchTo().frame(web element)
 * 	
 */

public class frame {
	public static void main(String[] args) throws InterruptedException {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement iframe = driver.findElement(By.xpath("//h3[contains(text(),'iFrame ')]"));
		
		Object iframescroll = js.executeScript("arguments[0].scrollIntoView()", iframe); // Scroll Down
	
		// To switch into frame using id 
		//driver.switchTo().frame("a077aa5e");
		
		// To swtich into frame using webelement
		WebElement frame = driver.findElement(By.name("a077aa5e"));
		driver.switchTo().frame(frame);
		
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		img.click();
		
		Thread.sleep(6000);
		driver.quit();
		
	}
	
}
