package com.qa.Pages;

import java.io.IOException;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BaseTest;

public class searchpage extends BaseTest{
	
	public searchpage() throws IOException {
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//*[@id=\"ebooks_grid\"]/div[2]/div[1]/a/i")
	WebElement wishlist;
	
	@FindBy(xpath="//*[@id=\"button_content-10183\"]/div/div/div/a[1]")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"ebooks_grid\"]/div[2]/div[2]/div[2]/p/a")
	WebElement author;
	
	@FindBy(xpath="//*[@id=\"ebooks_grid\"]/div[2]/div[2]/div[2]/div[1]")
	WebElement coursename;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/div[1]/a/i")
	WebElement addtocartbtn;
	
	
	
	
	
	public paymentpage Verifywishlist() throws IOException {
		wishlist.click();
		addtocart.click();
		addtocartbtn.click();
		
		return new paymentpage();
	}
	
	public String Verifysearchpgtitle() {
		return driver.getTitle();
	}

}
