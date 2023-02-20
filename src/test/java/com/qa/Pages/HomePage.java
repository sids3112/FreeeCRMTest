package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BaseTest;

public class HomePage extends BaseTest{

	public HomePage() throws IOException {
		PageFactory.initElements(driver,this);
		
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"navbarTopContent\"]/a[1]")
	WebElement primepacks;
	
	@FindBy(xpath="//*[@id=\"navbarTopContent\"]/a[2]/i")
	WebElement courses;
	
	@FindBy(xpath="//*[@id=\"navbarTopContent\"]/a[3]")
	WebElement ebooks;
	
	@FindBy(xpath="//*[@id=\"profile_url\"]/div/div[2]/h5")
	WebElement ClientUsrname;
	
	@FindBy(xpath="//*[@id=\"profileImage\"]")
	WebElement ProfileImage;
	
	@FindBy(name="key")
	WebElement searchkey;
	
	@FindBy(xpath="//*[@id=\"btnSearch\"]/i")
	WebElement searchclick;
	

	@FindBy(xpath="//*[@id=\"ebooks_grid\"]/div[2]/div[1]/a/i")
	WebElement wishlist;
	
	
	public void Verifywishlist() {
		wishlist.click();
	}

	

	
	public String validateHomePage() {
		return driver.getTitle();
		}
	
	public boolean Verifyusername() {
		ProfileImage.click();
		return ClientUsrname.isDisplayed();
		
	}
	
	public searchpage VerifySearch(String srch) throws IOException {
		searchkey.click();
		searchkey.sendKeys(srch);
		searchclick.click();
		
		return new searchpage();
	}
	
	
	
	
	

}
