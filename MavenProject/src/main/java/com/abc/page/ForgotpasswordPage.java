package com.abc.page;

import org.openqa.selenium.By;

import com.abc.utility.BaseClass;

public class ForgotpasswordPage {
	
	
	public void forgetpasswrd(String username) {
		
		BaseClass.driver.findElement(By.xpath("//*[@id=\"forgotPasswordLink\"]/a")).click();
		BaseClass.driver.findElement(By.xpath("//*[@id=\"securityAuthentication_userName\"]")).sendKeys(username);
		BaseClass.driver.findElement(By.xpath("//*[@id=\"btnSearchValues\"]")).click();
		
		
		
		
	}

}
