package com.abc.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.utility.BaseClass;

public class HomePage {
	//loactor of myinfo
	//myinfo click
	//page objecte model with pagefactory concept
	@FindBy(xpath = "//*[@id=\"menu_pim_viewMyDetails\"]/b")//myinfo link
	WebElement myinfo;
	//*[@id="welcome"]
	@FindBy(xpath = "//*[@id=\"welcome\"]")
	List<WebElement> welcomebtn;
	//*[@id="welcome-menu"]/ul/li[3]
	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]")
	List<WebElement>  logoutbtn;//exception  throug not size is 0
	public HomePage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	public WebElement grtMyInFolink() {
		return myinfo;
	}
	public List<WebElement> grtwelcomebtn() {
		return welcomebtn;
	}
	public List<WebElement> grtlogoutbtn() {
		return logoutbtn;
	}
	
	
	
	

}
