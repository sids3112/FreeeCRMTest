package Testcases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.Base.BaseTest;
import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;

public class HomePageTest  extends BaseTest{
	LoginPage login=new LoginPage();
	HomePage home = new HomePage();
	

	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	public void setup() throws IOException  {
		initialize();
		
			login=new LoginPage();
		
			home=login.logindetails(prop.getProperty("usremail"),prop.getProperty("usrpassword"));
	}
	
	
	@Test(priority=1)
	public void HomePageTitleTest() {
		String title2 =home.validateHomePage();
		System.out.println(title2);
		Assert.assertEquals(title2, "Login - Tutorialspoint");
	}
	
	@Test(priority=2)
	public void UserNameVerifyTest() {
		Assert.assertTrue(home.Verifyusername());   
		
	}
	
	@Test(priority=3)
	public void VerifySearchTest() throws IOException {
		home.VerifySearch(prop.getProperty("searchkey"));
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
	
	
	


}
