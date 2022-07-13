package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		//Configuring the Browser
			 System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
		//Launching the Browser    
			 WebDriver driver = new ChromeDriver();
		//Launching the application get method
			driver.get("https://www.redbus.in/");
		//id = email Find and Verify the user name 
			
			driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
					         
		     driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		     WebElement TxtSignIn = driver.findElement(By.xpath(""));
		     TxtSignIn.sendKeys("8675790508");
		     driver.quit();
		     
	}	
}
