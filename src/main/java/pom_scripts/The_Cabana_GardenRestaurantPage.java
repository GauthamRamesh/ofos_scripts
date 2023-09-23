package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class The_Cabana_GardenRestaurantPage extends BasePage{

	public The_Cabana_GardenRestaurantPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//a[text()=\"View Menu\"])[5]")
	private WebElement The_Cabana_Garden;
	
	@FindBy(xpath="//a[text()='Tandoori Chicken']/../../../../..//input[@value='Add To Cart']")
	private WebElement TandooriChickenAddToCart;
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement CheckOutButton;

	public WebElement getThe_Cabana_Garden() {
		return The_Cabana_Garden;
	}

	public WebElement getTandooriChickenAddToCart() {
		return TandooriChickenAddToCart;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}
	


}
