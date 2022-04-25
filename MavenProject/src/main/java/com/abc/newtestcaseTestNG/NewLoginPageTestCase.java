package com.abc.newtestcaseTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.abc.page.HomePage;
import com.abc.page.LoginPage;
import com.abc.utility.BaseClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class NewLoginPageTestCase extends BaseClass{
	
	@Test(description = "vaild pass and id ",priority = 2 ,enabled = false)
	public void TC1() {//login with valid crendential 
		
		/*
		 * BaseClass obj =new BaseClass(); obj.BrowserLaunch();
		 */
		 
		LoginPage obj1=new LoginPage();
		obj1.loginmethod("Admin", "admin123");

		//explicity wait becoaz locator cannat be found
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")));
				
		if(driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")).isDisplayed()) {
			System.out.println("user should be sucefuly login");
		}
		else {
			System.out.println("user enable to login valid credential");
		}
		driver.navigate().back();
		
	}
	@Test(description = "invaild userid and password ",priority = 1)
	public void TC() {
		//ExtentHtmlReporter spark = new ExtentHtmlReporter("Result/Result.html");Spark
		ExtentSparkReporter spark = new ExtentSparkReporter("Result/Result.html");
		//This is responsible for generating the report
				ExtentReports report = new ExtentReports();
			//Below code will tell Extend Report that in which format he has to generate report
				report.attachReporter(spark);
				
		//attach report ke pahile design badlna 
		
		
		  BaseClass obj =new BaseClass();
		   obj.BrowserLaunch();
		 
				LoginPage obj1=new LoginPage();
				obj1.loginmethod("Admin", "dmin123");
				
			ExtentTest test=report.createTest("Verify that user should be able to login with invalid credential")
					.assignCategory("smoke").assignCategory("regression").assignAuthor("Dhanraj");
				test.log(Status.INFO, "user shiuld be vaild username Admin");
				test.log(Status.INFO, "user shiuld be invaild password Admin");
				test.log(Status.INFO, "user shiuld login invilad credential");
				if(driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).isDisplayed()) {
					//gettext mag check
					test.log(Status.PASS, "user enable to login invalid crendential testcase pass");
					System.out.println("user enable to login invalid crendential testcase pass");
				}
				else {
					test.log(Status.FAIL, "user login invalid credential test case fail");
					System.out.println("user login invalid credential test case fail");
				}
				report.flush();
		
	}
	
	
	/*
	 * @AfterMethod
	 * 
	 * public void AfterMethod() {
	 * 
	 * HomePage homepage=new HomePage(); if(homepage.grtwelcomebtn().size()>0) {
	 * homepage.grtwelcomebtn().get(0).click(); if(homepage.grtlogoutbtn().size()>0)
	 * { homepage.grtlogoutbtn().get(0).click(); } }
	 * 
	 * 
	 * }
	 */
	 

}
