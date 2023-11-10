package org.Sample.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down3 {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.edge.driver",
				"E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement cna = driver.findElement(By.xpath("//a[text()='Create new account']"));
		cna.click();
		
		Thread.sleep(3000);  //   ----> Change another web page so use this
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s = new Select(month);
		
		List<WebElement> options = s.getOptions();
			
			for (int i = 0; i < options.size(); i++) {
				
				WebElement get = options.get(i);
				String text = get.getText();
				System.out.println(text);
			}
		driver.close();
	}
}
