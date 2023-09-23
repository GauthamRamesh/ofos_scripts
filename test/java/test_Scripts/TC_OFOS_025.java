package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.North_Street_Tavern_RestaurantPage;
import pom_scripts.OFOS_LoginPage;
import pom_scripts.OFOS_MyOrdersPage;
import pom_scripts.OFOS_RestaurantPage;
import pom_scripts.OrderNowPage;

public class TC_OFOS_025 extends Base_Test{
	@Test
	public void RemovingProductFromCart() throws IOException, InterruptedException {
		String title1="My Orders";
		OFOS_LoginPage login=new OFOS_LoginPage(driver);
		login.getLoginLink().click();
		ReadExcel e=new ReadExcel();
		login.getLoginUserNameTextField1().sendKeys(e.getData("OFOS_Login", 0, 0));
		login.getLoginPasswordTextField1().sendKeys(e.getData("OFOS_Login", 0, 1));
		login.getLoginButton().click();
		
		OFOS_RestaurantPage r = new OFOS_RestaurantPage(driver);
		r.getRestaurantLink().click();
		r.getNorthStreetTarevrnRestaurant().click();

		North_Street_Tavern_RestaurantPage res = new North_Street_Tavern_RestaurantPage(driver);
		res.getLobsterAddToCart().click();
		res.getCheckOutButton().click();

		OrderNowPage o = new OrderNowPage(driver);
		o.getCashonDelivery().click();
		o.getOrderNowButton().click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		alert.accept();
		
		
		OFOS_MyOrdersPage o1=new OFOS_MyOrdersPage(driver);
		o1.getDeleteIcon().click();
		alert.accept();
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		Assert.assertEquals(title1, driver.getTitle(),"The order is not been canceled from the cart");;
	}


}
