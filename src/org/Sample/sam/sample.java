package org.Sample.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class sample {
public static void main(String[] args) {
	
	System.setProperty("webdriver.edge.driver", "E:\\Software Testing\\Eclipse_Commiters\\Selenium\\drivers\\msedgedriver.exe");
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement email = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	email.sendKeys("9715435855");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("rk20062002");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
}
}
