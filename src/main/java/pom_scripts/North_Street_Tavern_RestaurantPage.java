package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class North_Street_Tavern_RestaurantPage extends BasePage{

	public North_Street_Tavern_RestaurantPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[text()=\"Restaurants \"]")
	private WebElement RestaurantLink;
	
	@FindBy(xpath="//a[text()='Yorkshire Lamb Patties']/../../../../..//input[@value='Add To Cart']")
	private WebElement YorkShireAddToCart;
	
	@FindBy(xpath="//a[text()='Lobster Thermidor']/../../../../..//input[@value='Add To Cart']")
	private WebElement LobsterAddToCart;
	
	@FindBy(xpath="//a[text()='Stuffed Jacket Potatoes']/../../../../..//input[@value='Add To Cart']")
	private WebElement StuffedJacketAddToCart;
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement CheckOutButton;

	public WebElement getRestaurantLink() {
		return RestaurantLink;
	}

	public WebElement getYorkShireAddToCart() {
		return YorkShireAddToCart;
	}

	public WebElement getLobsterAddToCart() {
		return LobsterAddToCart;
	}

	public WebElement getStuffedJacketAddToCart() {
		return StuffedJacketAddToCart;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}

}



