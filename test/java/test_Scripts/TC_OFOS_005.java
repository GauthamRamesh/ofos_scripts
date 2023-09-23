package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.EatalyRestaurantPage;
import pom_scripts.OFOS_LoginPage;
import pom_scripts.OFOS_RestaurantPage;
import pom_scripts.OrderNowPage;

public class TC_OFOS_005 extends Base_Test{
	@Test
	public void SpaghettiOrderFood() throws IOException, InterruptedException {
		String title = "My Orders";
        
		//Login to an application
		OFOS_LoginPage login = new OFOS_LoginPage(driver);
		login.getLoginLink().click();
		ReadExcel e1 = new ReadExcel();
		login.getLoginUserNameTextField1().sendKeys(e1.getData("OFOS_Login", 0, 0));
		login.getLoginPasswordTextField1().sendKeys(e1.getData("OFOS_Login", 0, 1));
		login.getLoginButton().click();
        
		//clicking on restaurant link and selecting restaurant
		OFOS_RestaurantPage r = new OFOS_RestaurantPage(driver);
		r.getRestaurantLink().click();
		r.getEataly().click();
   
		//selecting the dish from the restaurant
		EatalyRestaurantPage e = new EatalyRestaurantPage(driver);
		e.getPinkSpaghettiGamberoniAddToCart().click();
		e.getCheckOutButton().click();
 
		//selecting the mode of payment
		OrderNowPage o = new OrderNowPage(driver);
		o.getCashonDelivery().click();
		o.getOrderNowButton().click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		alert.accept();
		test.log(LogStatus.INFO, test.addScreenCapture(getPhoto(driver)));
		Assert.assertEquals(title, driver.getTitle(), "title of  my orders page should be displayed");
		
	}

}
