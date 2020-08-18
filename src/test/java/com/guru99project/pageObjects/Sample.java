package com.guru99project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sai\\Desktop\\Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys("mngr277552");
		driver.findElement(By.name("password")).sendKeys("ubutUmU");
		driver.findElement(By.name("btnLogin")).click();
	
		
		 WebElement element= driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
	 JavascriptExecutor executor = (JavascriptExecutor)driver;
	  executor.executeScript("arguments[0].click();", element);
	 
	
	}
}
