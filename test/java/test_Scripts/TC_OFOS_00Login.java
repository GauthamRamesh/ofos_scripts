package test_Scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.OFOS_LoginPage;

public class TC_OFOS_00Login extends Base_Test{
	@Test(dataProvider = "testdata", priority = 1)
	public void YorkshireOrdingFood(String username, String pwd) {
		String title = "Login";

		OFOS_LoginPage login = new OFOS_LoginPage(driver);
		login.getLoginLink().click();
		login.getLoginUserNameTextField1().sendKeys(username);
		login.getLoginPasswordTextField1().sendKeys(pwd);
		Assert.assertEquals(title, driver.getTitle(), "Logged in successfully");
		login.getLoginButton().click();

		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
	}

	@DataProvider(name = "testdata")
	public Object[][] gettestdata() throws IOException {
		Object[][] testdata = ReadExcel.getMultipleData("OFOS_Login");
		return testdata;

	}

}
