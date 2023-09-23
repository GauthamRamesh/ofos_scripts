package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Highlands_Bar_and_GrillRestaurantPage extends BasePage{

	public Highlands_Bar_and_GrillRestaurantPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//a[text()=\"View Menu\"])[4]")
	private WebElement Highlands_Bar_and_Grill;
	
	@FindBy(xpath="//a[text()='Chicken Madeira']/../../../../..//input[@value='Add To Cart']")
	private WebElement ChickenMadeiraAddToCart;
	
	@FindBy(xpath="//a[text()=' Buffalo Wings']/../../../../..//input[@value='Add To Cart']")
	private WebElement BuffaloWingsAddToCart;
	
	@FindBy(xpath="//a[text()='Mac N Cheese Bites']/../../../../..//input[@value='Add To Cart']")
	private WebElement MacNcheeseBitesAddToCart;
	
	@FindBy(xpath="//a[text()='Signature Potato Twisters']/../../../../..//input[@value='Add To Cart']")
	private WebElement signaturePotatoTwisterAddToCart;
	
	@FindBy(xpath="//a[text()='Meatballs Penne Pasta']/../../../../..//input[@value='Add To Cart']")
	private WebElement MeatballsPennePastaAddToCart;
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement CheckOutButton;

	public WebElement getHighlands_Bar_and_Grill() {
		return Highlands_Bar_and_Grill;
	}

	public WebElement getChickenMadeiraAddToCart() {
		return ChickenMadeiraAddToCart;
	}

	public WebElement getBuffaloWingsAddToCart() {
		return BuffaloWingsAddToCart;
	}

	public WebElement getMacNcheeseBitesAddToCart() {
		return MacNcheeseBitesAddToCart;
	}

	public WebElement getSignaturePotatoTwisterAddToCart() {
		return signaturePotatoTwisterAddToCart;
	}

	public WebElement getMeatballsPennePastaAddToCart() {
		return MeatballsPennePastaAddToCart;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}
	
	
	

}



