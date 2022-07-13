package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggySignUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
		WebElement txtmobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		txtmobile.sendKeys("8675790508");
		WebElement txtname = driver.findElement(By.xpath("//input[@id='name']"));
		txtname.sendKeys("Elan");
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));
		txtemail.sendKeys("sanprince246@gmail.com");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys("524163");
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
}
