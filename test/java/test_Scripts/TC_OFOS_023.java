package test_Scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_Test;
import generic.ReadExcel;
import pom_scripts.Nan_Xiang_Xiao_Long_BaoRestaurantPage;
import pom_scripts.OFOS_LoginPage;
import pom_scripts.OFOS_MyOrdersPage;
import pom_scripts.OFOS_RestaurantPage;
import pom_scripts.OrderNowPage;

public class TC_OFOS_023 extends Base_Test{
	@Test
	public void Deletingorder() throws IOException, InterruptedException {
		String title1="My Orders";
		OFOS_LoginPage login=new OFOS_LoginPage(driver);
		login.getLoginLink().click();
		ReadExcel e=new ReadExcel();
		login.getLoginUserNameTextField1().sendKeys(e.getData("OFOS_Login", 0, 0));
		login.getLoginPasswordTextField1().sendKeys(e.getData("OFOS_Login", 0, 1));
		login.getLoginButton().click();
		
		OFOS_RestaurantPage r=new OFOS_RestaurantPage(driver);
		r.getRestaurantLink().click();
		r.getNan_Xiang_Xiao_Long_Bao().click();
		
		Nan_Xiang_Xiao_Long_BaoRestaurantPage n=new Nan_Xiang_Xiao_Long_BaoRestaurantPage(driver);
		n.getManchurianChickenAddToCart().click();
		n.getCheckOutButton().click();
		
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
		TakesScreenshot ts=(TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("./ScreenShots/FoodImage12.png"));
		Assert.assertEquals(title1, driver.getTitle(),"Order is not been added into the cart");
		
		
	}

}
