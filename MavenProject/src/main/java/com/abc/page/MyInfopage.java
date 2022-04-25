package com.abc.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abc.utility.BaseClass;

public class MyInfopage {
	
	
	//pom with pagefactory
	//edit btn locator 
	//
	
	@FindBy(id="")
	WebElement editbutton;
	@FindBy(id="")
	WebElement firstname;
	@FindBy(id="")
	WebElement middlename;
	@FindBy(id="")
	WebElement lastname;
	@FindBy(id="")
	WebElement savebttun;
	public MyInfopage() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public WebElement grtMyinfoEditBtn() {
		return editbutton;
	}
	public WebElement grtfirstnametxt() {
		return firstname;
	}
	public WebElement grtmiddlenametxt() {
		return middlename;
	}
	public WebElement grtlastnametxt() {
		return lastname;
	}
	public WebElement grtsavebtn() {
		return savebttun;
	}
	
	//below method  will applicable to modify the name datail
	public void EditNameDetail(String firstname,String middlename,String lastname) {
		
		grtMyinfoEditBtn().click();
		grtfirstnametxt().sendKeys(firstname);
		grtmiddlenametxt().sendKeys(middlename);
		grtlastnametxt().sendKeys(lastname);
		grtsavebtn().click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
