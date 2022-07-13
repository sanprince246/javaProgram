package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	
		public static void main(String[] args) {
		//Configuring the Browser
			 System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
		//Launching the Browser    
			 WebDriver driver = new ChromeDriver();
		//Launching the application get method
			driver.get("http://demo.automationtesting.in/Register.html");
		//id = email Find and Verify the user name 
			 WebElement txtUserName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		     txtUserName.sendKeys("Elan");
		     
		     WebElement txtUserPassword = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		     txtUserPassword.sendKeys("san");
		     
		     WebElement txtAddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		     txtAddress.sendKeys("Elan,manapparai,trichy");
		     
		     WebElement txtEmail = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		     txtEmail.sendKeys("sanprince246@gmail.com");
		     
		     WebElement txtTelephone = driver.findElement(By.xpath("//input[@type='tel']"));
		     txtTelephone.sendKeys("8675790508");
		     
		     driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		     
		     driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		     
		     driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		     
		     
		     
		     driver.quit();

}

}
