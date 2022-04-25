package com.abc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.abc.utility.BaseClass;


public class LoginPage {
	
	public WebElement getLoginUsername() {
		return BaseClass.driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
	}
	public WebElement getLoginpassword() {
		return BaseClass.driver.findElement(By.xpath("//*[@id=\"txtPassword\"]"));
	}
	public WebElement getLoginbttn() {
		return BaseClass.driver.findElement(By.xpath("//*[@id=\"btnLogin\"]"));
	}
	
	public void loginmethod (String username1, String pasword1) {
		getLoginUsername().sendKeys(username1);
		getLoginpassword().sendKeys(pasword1);
		getLoginbttn().click();
	}

}
