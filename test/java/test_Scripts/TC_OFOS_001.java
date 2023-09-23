package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.OFOS_LoginPage;
import pom_scripts.OFOS_RegisterPage;

public class TC_OFOS_001 extends Base_Test{
	@Test(dataProvider = "testdata")

	public void RegisterAndLogin(String username, String first, String last, String password, String email,
			String confirm, String deliver) {

		OFOS_RegisterPage register = new OFOS_RegisterPage(driver);
		register.getRegisterLink().click();
		register.getUserTextfield().sendKeys(username);
		register.getFirstnameTextField().sendKeys(first);
		register.getLastnameTextField().sendKeys(last);
		register.getPasswordTextField().sendKeys(password);
		register.getEmailTextField().sendKeys(email);
		register.getCpasswordTextField().sendKeys(confirm);
		register.getPhoneTextField().sendKeys("25474445");
		register.getAddressTextField().sendKeys(deliver);
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		register.getRegisterButton().click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@DataProvider(name = "testdata")
	public Object[][] gettestdata() throws IOException {
		Object[][] testdata = ReadExcel.getMultipleData("register_OFOS");
		return testdata;

	}

}