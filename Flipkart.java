package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		//Configuring the Browser
			 System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
		//Launching the Browser    
			 WebDriver driver = new ChromeDriver();
		//Launching the application get method
			driver.get("https://www.flipkart.com/"); 
			driver.manage().window().maximize();
			
		//driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();	
		
		WebElement smsFrom = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    smsFrom.sendKeys("sanprince246@gmail.com");

	    WebElement smsTo = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
	    smsTo.sendKeys("Trichy");
	    
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	    
	    driver.quit();
}
}
