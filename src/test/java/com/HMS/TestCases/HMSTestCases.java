package com.HMS.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.HMS.PageObjects.HMSLoginPage;
import com.framework.core.CommonMethod;
import com.framework.core.TestBase;

public class HMSTestCases extends TestBase {
	
	HMSLoginPage loginpage = new HMSLoginPage();
	
	
	@Test(priority=1)
	public void HMSLogin() throws IOException{
		    test = extent.createTest("HMS Login");
		 	try{
				loginpage.generateDataForHMSLogin();
				loginpage.fillupDataForHMSLOgin(driver);
				loginpage.clickOnLoginButton(driver);
				loginpage.verifyLoginFunctionality(driver);
		 	}
		 
			 catch(Throwable t) 
			   {	
				 log.error(t.getLocalizedMessage());
		         Error e1 = new Error(t.getMessage()); 
		         log.error("TestCase failed" +t.getLocalizedMessage());
		         log.error(t.getMessage());
		         e1.setStackTrace(t.getStackTrace()); 
		         throw e1;
			  }	
		 	}
	
	@Test(priority=2)
	public void HMSLogout() throws IOException{
		    test = extent.createTest("HMS Logout");
		 	try{
				loginpage.clickOnLogoutButton();
		 	}
			 catch(Throwable t) 
			   {	
				 log.error(t.getLocalizedMessage());
		         Error e1 = new Error(t.getMessage()); 
		         log.error("TestCase failed" +t.getLocalizedMessage());
		         log.error(t.getMessage());
		         e1.setStackTrace(t.getStackTrace()); 
		         throw e1;
			  }	
		 	}
	
	
	
	
	
	
	
	
	
	
	

}
