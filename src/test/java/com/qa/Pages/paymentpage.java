package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Base.BaseTest;

public class paymentpage extends BaseTest {

	public paymentpage() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//*[@id=\"apply_coupon\"]")
	WebElement couponbtn;
	
	@FindBy(xpath="//*[@id=\"offcanvas-flip\"]/div/div/div/div/div[2]/label/div/a")
	WebElement couponcode;
	
	@FindBy(xpath="/html/body/div[9]/div/div[4]/div[2]/button")
	WebElement remove;
	
	@FindBy(xpath="//*[@id=\"cart_items\"]/div/table/tbody/tr/td[3]/a")
	WebElement del;
	
	public String verifytitle() {
		return driver.getTitle();
	}
	
	public void last() {
		couponbtn.click();
		couponcode.click();
		
		del.click();
		remove.click();
	}

}
