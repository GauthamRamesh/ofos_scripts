package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EatalyRestaurantPage extends BasePage{
	
	public EatalyRestaurantPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="(//a[text()=\"View Menu\"])[2]")
	private WebElement Eataly;
	
	@FindBy(xpath="//a[text()='Pink Spaghetti Gamberoni']/../../../../..//input[@value='Add To Cart']")
	private WebElement PinkSpaghettiGamberoniAddToCart;
	
	@FindBy(xpath="//a[text()='Cheesy Mashed Potato']/../../../../..//input[@value='Add To Cart']")
	private WebElement CheesyMashedPotatoAddToCart;
	
	@FindBy(xpath="//a[text()='Crispy Chicken Strips']/../../../../..//input[@value='Add To Cart']")
	private WebElement CrispyChickenStripsAddToCart;
	
	@FindBy(xpath="//a[text()='Lemon Grilled Chicken And Pasta']/../../../../..//input[@value='Add To Cart']")
	private WebElement LemonGrilledchickenAddToCart;
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement CheckOutButton;

	public WebElement getEataly() {
		return Eataly;
	}

	public WebElement getPinkSpaghettiGamberoniAddToCart() {
		return PinkSpaghettiGamberoniAddToCart;
	}

	public WebElement getCheesyMashedPotatoAddToCart() {
		return CheesyMashedPotatoAddToCart;
	}

	public WebElement getCrispyChickenStripsAddToCart() {
		return CrispyChickenStripsAddToCart;
	}

	public WebElement getLemonGrilledchickenAddToCart() {
		return LemonGrilledchickenAddToCart;
	}

	public WebElement getCheckOutButton() {
		return CheckOutButton;
	}
	
	

}



