package com.abc.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.utility.BaseClass;

public class LoginPageWithPageFactory {
	@FindBy(xpath="//*[@id=\\\"txtUsername\\\"]")
	@CacheLookup
	WebElement username;
	@FindBy(xpath="//*[@id=\\\"txtPassword\\\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\\\"btnLogin\\\"]")
	@CacheLookup
	WebElement loginbtn;
	
	public LoginPageWithPageFactory() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public WebElement getLoginUsername() {
		//return BaseClass.driver.findElement(By.xpath("//*[@id=\"txtUsername\"]"));
		return username;
	}
	public WebElement getLoginpassword() {
		return password;
	}
	public WebElement getLoginbttn() {
		return loginbtn;
	}
	
	public void loginmethod (String username, String password) {
		getLoginUsername().sendKeys(username);
		getLoginpassword().sendKeys(password);
		getLoginbttn().click();
	}

}
