package Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Base.BaseTest;
import com.qa.Pages.LoginPage;
import com.qa.Utilities.TestUtil;





public class firstTest extends BaseTest{
	LoginPage login;
	String sheetname="CrmTestData";
	
	public firstTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@BeforeMethod
	public void setup() throws IOException {
		initialize();
		
		 login = new LoginPage();
	}
	
	@Test(priority=2)
	public void LoginPageTitleTest() {
		String title=login.ValidateLoginPage();
		Assert.assertEquals(title, "Online Tutorials Library");
	}
	@DataProvider
	public Object[][] getcrmdata() {
		Object[][]data=TestUtil.getTestData(sheetname);
		return data;
		
	}
	
	@Test(priority=1,dataProvider="getcrmdata")
	public void verifydataxl(String name) {
		login.checkdataxl(name);
	}
	@Test(priority=3)
	public void teardown() throws IOException {
		login.logindetails(prop.getProperty("usremail"),prop.getProperty("usrpassword"));
	}
	
	@AfterTest
	public void teardown2() {
		driver.quit();
	}

	
	
}
