package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Highlands_Bar_and_GrillRestaurantPage;
import pom_scripts.OFOS_LoginPage;
import pom_scripts.OFOS_RestaurantPage;
import pom_scripts.OrderNowPage;

public class TC_OFOS_014 extends Base_Test{
	@Test
	public void PotatoTwisterOrderingFood() throws IOException, InterruptedException {
		String title1="My Orders";
		OFOS_LoginPage login = new OFOS_LoginPage(driver);
		ReadExcel e1=new ReadExcel();
		login.getLoginUserNameTextField1().sendKeys(e1.getData("OFOS_Login", 0, 0));
		login.getLoginPasswordTextField1().sendKeys(e1.getData("OFOS_Login", 0, 1));
		login.getLoginButton().click();
		OFOS_RestaurantPage r=new OFOS_RestaurantPage(driver);
		r.getRestaurantLink().click();
		r.getHighlands_Bar_and_Grill().click();
		
		Highlands_Bar_and_GrillRestaurantPage h=new Highlands_Bar_and_GrillRestaurantPage(driver);
		h.getSignaturePotatoTwisterAddToCart().click();
		h.getCheckOutButton().click();
		
		OrderNowPage o = new OrderNowPage(driver);
		o.getCashonDelivery().click();
		o.getOrderNowButton().click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		alert.accept();
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		Assert.assertEquals(title1, driver.getTitle(),"title of  my orders page should be displayed");
		
	}


}
