package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModelResume {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	WebElement ResumeClick = driver.findElement(By.xpath("//div[@id='heading201']"));
	ResumeClick.click();
	Thread.sleep(5000);
	WebElement ResumeClick1 = driver.findElement(By.xpath("//a[@title='Model Resume training in chennai'][1]"));
	ResumeClick1.click();
	
	Thread.sleep(5000);
	driver.quit();
}
}
