package com.abc.utility;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCoanditions {
	
	//specific condition--explicity wait
	//webdriverwait /fluentwait
	public void WaitforClick(WebElement locator) {
		WebDriverWait wait=new WebDriverWait(BaseClass.driver,Integer.parseInt( BaseClass.prop.getProperty("expectedconditionwait")));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
			
	}
	public void WaitforTitle(String PageTitle) {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(BaseClass.driver);
		wait.withTimeout(Duration.ofSeconds(Integer.parseInt( BaseClass.prop.getProperty("expectedconditionwait"))));
		wait.pollingEvery(Duration.ofSeconds(10));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.titleContains(PageTitle));		
	}
	

}
