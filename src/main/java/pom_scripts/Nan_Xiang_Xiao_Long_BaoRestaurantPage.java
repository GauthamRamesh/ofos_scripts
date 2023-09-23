package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Nan_Xiang_Xiao_Long_BaoRestaurantPage extends BasePage{

	public Nan_Xiang_Xiao_Long_BaoRestaurantPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="(//a[text()=\"View Menu\"])[3]")
	private WebElement Nan_Xiang_Xiao_Long_Bao;
	
	@FindBy(xpath="//a[text()='Vegetable Fried Rice']/../../../../..//input[@value=\"Add To Cart\"]")
	private WebElement FriedRiceAddToCart;
	
	@FindBy(xpath="//a[text()='Prawn Crackers']/../../../../..//input[@value=\"Add To Cart\"]")
	private WebElement PrawnCrackersAddToCart;
	
	@FindBy(xpath="//a[text()='Spring Rolls']/../../../../..//input[@value=\"Add To Cart\"]")
	private WebElement SpringRollsAddToCart;
	
	@FindBy(xpath="//a[text()='Manchurian Chicken']/../../../../..//input[@value=\"Add To Cart\"]")
	private WebElement ManchurianChickenAddToCart;
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement CheckOutButton;

	public WebElement getNan_Xiang_Xiao_Long_Bao() {
		return Nan_Xiang_Xiao_Long_Bao;
	}

	public WebElement getFriedRiceAddToCart() {
		return FriedRiceAddToCart;
	}

	public WebElement getPrawnCrackersAddToCart() {
		return PrawnCrackersAddToCart;
	}

	public WebElement getSpringRollsAddToCart() {
		return SpringRollsAddToCart;
	}

	public WebElement getManchurianChickenAddToCart() {
		return ManchurianChickenAddToCart;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}

}



