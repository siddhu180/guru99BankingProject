package com.guru99project.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.guru99project.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseURL);
		Logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		Logger.info("username is entered");
		lp.setPassword(password);
		Logger.info("pwd is entered");
		lp.clickSubmit();
		Logger.info("Logged into web");
		
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			Logger.info("Test case passed");
			
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			Logger.info("Test case passed");
			
		}
	}
	

}
