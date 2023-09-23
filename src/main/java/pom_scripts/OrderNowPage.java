package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderNowPage extends BasePage{

	public OrderNowPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//span[text()='Cash on Delivery']")
	private WebElement CashonDelivery;
	
	@FindBy(xpath="//span[text()='Paypal ']")
	private WebElement PayPalOption;
	
	@FindBy(xpath="//input[@value='Order Now']")
	private WebElement OrderNowButton;

	public WebElement getCashonDelivery() {
		return CashonDelivery;
	}

	public WebElement getPayPalOption() {
		return PayPalOption;
	}

	public WebElement getOrderNowButton() {
		return OrderNowButton;
	}


}
