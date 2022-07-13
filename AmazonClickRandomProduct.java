package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonClickRandomProduct {
	public static void main(String[] args) throws InterruptedException {
		//Configuring the Browser
			 System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
		//Launching the Browser    
			 WebDriver driver = new ChromeDriver();
		//Launching the application get method
			driver.get("https://www.amazon.in/");    
			
		driver.findElement(By.xpath("//img[@alt='Logitech B170 Wireless Mouse, 2.4 GHz with USB Nano Receiver, Optical Tracking, 12-Months Battery Life, Ambidextrous,...']")).click();	
		
		driver.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();	 
		Thread.sleep(3000);
		
	    driver.quit();
	}
}
