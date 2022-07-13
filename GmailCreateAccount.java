package org.seleniumpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		//Configuring the Browser
			 System.setProperty("webDriver.Chrome.Driver", "C:\\Users\\Elaravasan.E\\eclipse-workspace\\SeleniumPracticeTasks\\driver\\chromedriver.exe");
		//Launching the Browser    
			 WebDriver driver = new ChromeDriver();
		//Launching the application get method
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");    
		driver.manage().window().maximize();	
				
		WebElement nameFirst = driver.findElement(By.xpath("//input[@id='firstName']"));
	    nameFirst.sendKeys("suriya");

	    WebElement nameLast = driver.findElement(By.xpath("//input[@id='lastName']"));
	    nameLast.sendKeys("Rajesh");

	    WebElement nameUser = driver.findElement(By.xpath("//input[@id='username']"));
	    nameUser.sendKeys("Rajeshsuriya246");

	    WebElement paasword = driver.findElement(By.xpath("//input[@type='password'][1]"));
	    paasword.sendKeys("Elan246");
	    
	    WebElement paaswordCon = driver.findElement(By.xpath("//input[@aria-label='Confirm']"));
	    paaswordCon.sendKeys("Elan246");
	    
	    //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	    Thread.sleep(3000);
	   
	    
	    driver.quit();
}
	
}
