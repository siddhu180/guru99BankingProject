package com.guru99project.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver driver;
	
	public AddCustomerPage(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Customer')]")
	WebElement lnkAddNewCustomer;
	
	@FindBy(how = How.NAME, using="name")
	WebElement customerName;
	
	@FindBy(how = How.NAME, using="rad1")
	WebElement reqGender;
	
	@FindBy(how = How.ID, using="dob")
	WebElement cxDOB;
	
	@FindBy(how = How.NAME, using="addr")
	WebElement cxADDR;
	
	@FindBy(how=How.NAME, using="city")
	WebElement cxCity;
	
	@FindBy(how = How.NAME, using="state")
	WebElement cxState;
	
	@FindBy(how = How.NAME, using="pinno")
	WebElement cxPIN;
	
	@FindBy(how = How.NAME, using="telephoneno")
	WebElement cxTelphn;
	
	@FindBy(how = How.NAME, using="emailid")
	WebElement cxEmail;
	
	@FindBy(how = How.NAME, using="sub")
	WebElement subBtn;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	
	public void setCxName(String cname) {
		customerName.sendKeys(cname);
	}
	
	public void setCxGender(String cgender) {
		reqGender.sendKeys(cgender);
	}
	public void setCxDOB(String dob) {
		cxDOB.sendKeys(dob);
		
	}
	public void setCxAddr(String addr) {
		cxADDR.sendKeys(addr);
	}
	
	public void setCxCity(String city) {
		cxCity.sendKeys(city);
	}

	public void setCxState(String state) {
		cxState.sendKeys(state);
	}
	
	public void setPostal(String pincode) {
		cxPIN.sendKeys(pincode);
	}
	
	public void setTelNum(String phnNum) {
		cxTelphn.sendKeys(phnNum);
	}
	
	public void setCxEmail(String email) {
		cxEmail.sendKeys(email);
	}
	public void setSubmit() {
		subBtn.click();
	}
	
	
	
	
}
