package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {
		//Configuring the Browser
			 System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
		//Launching the Browser    
			 WebDriver driver = new ChromeDriver();
		//Launching the application get method
			driver.get("https://www.snapdeal.com/");    
			
				
			driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']")).click();

			driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();

	    WebElement nameUser = driver.findElement(By.xpath("//input[@id='userName']"));
	    nameUser.sendKeys("Rajeshsuriya");                 

	   
	    
	    driver.findElement(By.xpath("//button[@id='checkUser']")).click();
	    
	    driver.quit();
}
	
}
