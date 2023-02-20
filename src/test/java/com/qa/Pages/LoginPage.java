package com.qa.Pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BaseTest;



public class LoginPage extends BaseTest{
	
	@FindBy(xpath="//*[@id=\"search-strings\"]")
	WebElement searchbox;
	
	@FindBy(xpath="//*[@id=\"btnSearch\"]/i")
	WebElement searchbtn;
	
	@FindBy(xpath="/html/body/header/nav/div/div[2]/a")
	WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"user_email\"]")
	WebElement usremail;
	
	@FindBy(xpath="//*[@id=\"user_password\"]")
	WebElement usrpassword;
	
	@FindBy(name="user_login")
	WebElement usrlogin;

	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public void checkdataxl(String name) {
		searchbox.click();
		searchbox.sendKeys(name);
		searchbtn.click();
	}
	
	public String ValidateLoginPage() {
		return  driver.getTitle();
	}
	
	
	public HomePage logindetails(String usr,String pass) throws IOException {
		loginbtn.click();
		usremail.click();
		usremail.sendKeys(usr);
		usrpassword.click();
		usrpassword.sendKeys(pass);
		
		usrlogin.click();
		
		return new HomePage();
		
	}

	

}
