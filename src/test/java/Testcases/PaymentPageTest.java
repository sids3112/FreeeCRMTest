package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.BaseTest;
import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.paymentpage;
import com.qa.Pages.searchpage;

public class PaymentPageTest extends BaseTest{
	LoginPage login ;
	HomePage home;
	searchpage search;
	paymentpage payment=new paymentpage();

	public PaymentPageTest() throws IOException {
		super();
		
	}
	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		login=new LoginPage();
		home=new HomePage();
		search=new searchpage();
		home=login.logindetails(prop.getProperty("usremail"),prop.getProperty("usrpassword"));
		search=home.VerifySearch(prop.getProperty("searchkey"));
		payment=search.Verifywishlist();
	}
	
	@Test(priority=1)
	public void verifytitle() {
		String title3=payment.verifytitle();
		Assert.assertEquals(title3,"Shopping Cart details - Tutorialspoint");
	}
	
	@Test(priority=2)
	public void Checkpaymentpage() {
		payment.last();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	

}
