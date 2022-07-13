package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	public static void main(String[] args) {
		//Configuring the Browser
			 System.setProperty("webDriver.Chrome.Driver","\"C:\\Users\\Elaravasan.E\\Desktop\\chromedriver.exe\"");
			 WebDriver driver = new ChromeDriver();
		//Launching the application get method
			driver.get("https://www.facebook.com/");
		//id = email Find and Verify the user name 
			 WebElement txtUserName = driver.findElement(By.id("email"));
		     txtUserName.sendKeys("Elan246#");
		     
		     WebElement txtUserPassword = driver.findElement(By.id("pass"));
		     txtUserPassword.sendKeys("iphone");
		     
		     driver.findElement(By.xpath("//button[@type='submit']")).click();
		     driver.quit();

}
}
