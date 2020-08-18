package com.guru99project.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99project.pageObjects.LoginPage;
import com.guru99project.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	@Test(dataProvider="LoginData")
	public void loginDDT(String username, String password) throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept(); //close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			Logger.warn("Login failed");
		}
		else {
			Assert.assertTrue(true);
			Logger.info("Login provided");
			Logger.info("clicking logout");
			Thread.sleep(3000);
			lp.clickLogout();
			Logger.info("Clicked logout");
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	} 
	
	public boolean isAlertPresent()
	{
		try {

			driver.switchTo().alert();
			return true;
		}
		catch(NoAlertPresentException e)
			{
			return false;
			
			}
	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path="./\\src\\test\\java\\com\\guru99project\\testData\\LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		System.out.println(rownum);
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		System.out.println(colcount);
		String logindata[][] = new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
				
				System.out.println("Logging for:"+logindata[i-1][j]);
			}
		}
		return logindata;
	}
	
	

}
