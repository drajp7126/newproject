package com.abc.testcase;

import com.abc.page.HomePage;
import com.abc.page.LoginPage;
import com.abc.page.MyInfopage;
import com.abc.utility.BaseClass;

public class HomePageTestCase {
		
	//verify that user shold be able to madify my info
	//step1= lauch browser with url
	//login with valid credential
	//click on my info
	//click on edit bottun
	//update same detail
	
	public static void main(String[] args) {
		BaseClass obj=new BaseClass();//1 browser launch
		obj.BrowserLaunch();
		
		LoginPage login=new LoginPage();//2login
		login.loginmethod("Admin", "admin123");
		
		HomePage homepage=new HomePage();//3homepage 
		homepage.grtMyInFolink().click();//myinfo method call and click
		
		MyInfopage myinfo=new MyInfopage();
		myinfo.EditNameDetail("dhanraj", "", "patil");

	}

}
