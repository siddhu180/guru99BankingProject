package com.guru99project.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.guru99project.pageObjects.AddCustomerPage;
import com.guru99project.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {

	@Test
	public void addNewCustomer() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		
		Logger.info("User Credentials are providing");
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		Logger.info("Credentials are submitted");
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		Logger.info("Cx details are entered");
		
		addcust.clickAddNewCustomer();
		addcust.setCxName("Sid");
		addcust.setCxGender("female");
		addcust.setCxDOB("1995-06-25");
		addcust.setCxCity("Mississauga");
		addcust.setCxState("Ontario");
		addcust.setPostal("L5R2W3");
		addcust.setTelNum("6475481234");
		
		String email=randomeString()+"gmail.com";
	addcust.setCxEmail(email);
	addcust.setSubmit();
	
	Thread.sleep(3000);
	Logger.info("Cx is able to submit the details");
	}
	
	public String randomeString() {
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	
}
