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
import pom_scripts.OFOS_RestaurantPage;
import pom_scripts.OrderNowPage;

public class TC_OFOS_004 extends Base_Test{
	@Test
	public void StuffedOrderingFood() throws IOException, InterruptedException {
		String title1 = "My Orders";
		
        //Login to the application
		OFOS_LoginPage login = new OFOS_LoginPage(driver);
		login.getLoginLink().click();
		ReadExcel e = new ReadExcel();
		login.getLoginUserNameTextField1().sendKeys(e.getData("OFOS_Login", 0, 0));
		login.getLoginPasswordTextField1().sendKeys(e.getData("OFOS_Login", 0, 1));
		login.getLoginButton().click();
        
		//Clicking on restaurant link and selecting the restaurant 
		OFOS_RestaurantPage r = new OFOS_RestaurantPage(driver);
		r.getRestaurantLink().click();
		r.getNorthStreetTarevrnRestaurant().click();
        
		//Selecting the dish from the restaurant and adding to the cart
		North_Street_Tavern_RestaurantPage res = new North_Street_Tavern_RestaurantPage(driver);
		res.getStuffedJacketAddToCart().click();
		res.getCheckOutButton().click();

		//Selecting the mode of payment in MyOrders Page
		OrderNowPage o = new OrderNowPage(driver);
		o.getCashonDelivery().click();
		o.getOrderNowButton().click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		alert.accept();
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		Assert.assertEquals(title1, driver.getTitle(), "title of  my orders page should be displayed");
	}

}
