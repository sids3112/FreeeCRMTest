package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.Base.BaseTest;
import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Pages.searchpage;

public class searchpageTest extends BaseTest{
	
	LoginPage login ;
	HomePage home;
	searchpage search=new searchpage();
	
	public searchpageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setup() throws IOException {
		initialize();
		login=new LoginPage();
		home=new HomePage();
		home=login.logindetails(prop.getProperty("usremail"),prop.getProperty("usrpassword"));
		search=home.VerifySearch(prop.getProperty("searchkey"));
	}
	
	@Test(priority=1)
	public void verifytitle() {
		
		String title=search.Verifysearchpgtitle();
		Assert.assertEquals(title, "Search Video Courses, eBooks, Prime Pack - Tutorialspoint");
		System.out.println(title);
	}
	@Test(priority=2)
	public void verifywish() throws IOException {
		search.Verifywishlist();
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
	
	


