package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main(String[] args) {
		//Configuring the Browser
			 System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
		//Launching the Browser    
			 WebDriver driver = new ChromeDriver();
		//Launching the application get method
			driver.get("https://www.amazon.in/");
		//id = email Find and Verify the user name 
			 WebElement txtUserName = driver.findElement(By.id("twotabsearchtextbox"));
		     txtUserName.sendKeys("iphone");
		     driver.findElement(By.id("nav-search-submit-button")).click();
		     driver.quit();

}
}
