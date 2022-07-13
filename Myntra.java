package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
	driver.manage().window().maximize();
	WebElement txtMobile = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
	txtMobile.sendKeys("8675790508");
	driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
	Thread.sleep(3000);
	driver.quit();
}
}
