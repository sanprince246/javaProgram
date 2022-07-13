package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseAutomationToolSqa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		driver.manage().window().maximize();
		WebElement txtFirstName = driver.findElement(By.id("first-name"));
		txtFirstName.sendKeys("Elavarasan");
		WebElement txtLastName = driver.findElement(By.id("last-name"));
		txtLastName.sendKeys("Elangovan");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("sanprince246@gmail.com");
		WebElement txtMobile = driver.findElement(By.id("mobile"));
		txtMobile.sendKeys("8675790508");                                 
		WebElement txtCity = driver.findElement(By.id("city"));
		txtCity.sendKeys("Trichy");
		WebElement txtAddress = driver.findElement(By.xpath("//textarea[@class='upcoming__registration--input']"));
		txtAddress.sendKeys("manapparai,Trichy-621302");
		Thread.sleep(3000);
		driver.quit();
		
	}

}
