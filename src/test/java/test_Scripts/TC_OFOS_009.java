package test_Scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.OFOS_LoginPage;
import pom_scripts.OFOS_RestaurantPage;
import pom_scripts.OrderNowPage;
import pom_scripts.The_Cabana_GardenRestaurantPage;

public class TC_OFOS_009 extends Base_Test{
	@Test
	public void TandoorichickenOrderingFood() throws IOException, InterruptedException {
		String title1="My Orders";
		OFOS_LoginPage login = new OFOS_LoginPage(driver);
		ReadExcel e1=new ReadExcel();
		login.getLoginUserNameTextField1().sendKeys(e1.getData("OFOS_Login", 0, 0));
		login.getLoginPasswordTextField1().sendKeys(e1.getData("OFOS_Login", 0, 1));
		login.getLoginButton().click();
		OFOS_RestaurantPage r=new OFOS_RestaurantPage(driver);
		r.getRestaurantLink().click();
		r.getThe_Cabana_Garden().click();
		
		The_Cabana_GardenRestaurantPage c=new The_Cabana_GardenRestaurantPage(driver);
		c.getTandooriChickenAddToCart().click();
		c.getCheckOutButton().click();

		OrderNowPage o = new OrderNowPage(driver);
		o.getCashonDelivery().click();
		o.getOrderNowButton().click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);
		alert.accept();
		Assert.assertEquals(title1, driver.getTitle(),"title of  my orders page should be displayed");
		
	}

}
