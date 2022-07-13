package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	
	public static void main(String[] args) throws InterruptedException {
	//Configuring the Browser
		 System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
	//Launching the Browser    
		 WebDriver driver = new ChromeDriver();
	//Launching the application get method
		driver.get("https://www.cleartrip.com/trains");
	
	WebElement smsFrom = driver.findElement(By.xpath("//input[@title='From station']"));
    smsFrom.sendKeys("Chennai");

    WebElement smsTo = driver.findElement(By.xpath("//input[@title='To station']"));
    smsTo.sendKeys("Trichy");

    
    driver.findElement(By.xpath("//select[@id='trainClass']")).click();
    
    driver.findElement(By.xpath("//div[@class='col col2 tCenter']")).click();    
    
    driver.findElement(By.xpath("//button[@id='trainFormButton']")).click();
    Thread.sleep(3000);
    
    driver.quit();
    
}
}
