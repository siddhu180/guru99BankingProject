package com.guru99project.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver rdriver) {
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "uid")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(name = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(name = "btnLogin")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(linkText = "Log out")
	@CacheLookup 
	WebElement logout;

	public void setUserName(String uName) {
		txtUserName.sendKeys(uName);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}

	public void clickSubmit() {
		btnLogin.click();
	}

	public void clickLogout() {
		 WebElement element= driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		  executor.executeScript("arguments[0].click();", element);

	}
}
