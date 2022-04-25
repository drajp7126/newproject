package com.abc.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.abc.page.LoginPage;
import com.abc.page.LoginPageWithPageFactory;
import com.abc.utility.BaseClass;

public class LoginPageTestcase extends BaseClass{
	/*
	 * open browser url enter vaild credential and click on login button
	 * 
	 * open browser url 
	 * enter vaild usermane
	 * 
	 *  selenium find element perform operation
	 * creat loactor and send key
	 * 
	 * enter vaild password 
	 * creat loacator send key result nxt page find locator
	 */
	public static void main(String[] args) {
		
		BaseClass obj =new BaseClass();
		obj.BrowserLaunch();
		
		//login with valid crendential 
		
		/*
		 * driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		 * driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123")
		 * ; driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		 */
	//	LoginPageWithPageFactory obj1=new LoginPageWithPageFactory();
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

		
		//login with invalid credential
		obj1.loginmethod("Admin", "dmin123");
		/*
		 * driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		 * driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("dmin123");
		 * driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		 */
		if(driver.findElement(By.xpath("//*[@id=\"spanMessage\"]")).isDisplayed()) {
			//gettext mag check
			System.out.println("user enable to login invalid crendential testcase pass");
		}
		else {
			
			System.out.println("user login invalid credential test case fail");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
