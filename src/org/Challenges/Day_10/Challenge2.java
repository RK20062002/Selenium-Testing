package org.Challenges.Day_10;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge2 {
	public static void main(String[] args) throws InterruptedException {
		
		// 1. Browser Configuration
		System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		
		// 2. Launch the browser
		WebDriver driver = new EdgeDriver();
		
		// 3. Launch the URL
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		WebElement searchbar = driver.findElement(By.name("keyword"));
		searchbar.sendKeys("iphone 7");

		String Parent = driver.getWindowHandle();
		System.out.println("Parent id : "+Parent);
		
		WebElement searchbtn = driver.findElement(By.xpath("(//span[contains(text(),'Search')])[1]"));
		searchbtn.click();
		
		Thread.sleep(3000);
		WebElement phone = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
		phone.click();
		
		Set<String> newWindow = driver.getWindowHandles();
		System.out.println("New Window id : "+newWindow);
		
		for (String window : newWindow) {
			if (window != Parent) {
				driver.switchTo().window(window);
			}
		}
		
		WebElement addToCart = driver.findElement(By.xpath("//span[contains(text(),'add to cart')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Object addToCartBtn = js.executeScript("arguments[0].scrollIntoView(false)", addToCart);
		addToCart.click();
		
		WebElement price = driver.findElement(By.xpath("(//span[contains(text(),'Rs. 199')])[2]"));
		String text = price.getText();
		System.out.println("Price : "+text);
		
	}
}
