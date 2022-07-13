package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensInterview {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	driver.manage().window().maximize();
	driver.findElement(By.	xpath("//div[@id='heading20']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[text()='CTS Interview Question ']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
