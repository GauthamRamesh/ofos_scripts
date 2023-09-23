package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToscanaRestaurantPage extends BasePage{

	public ToscanaRestaurantPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//a[text()=\"View Menu\"])[6]")
	private WebElement Toscana;
	
	@FindBy(xpath="//a[text()='Taco Bell']/../../../../..//input[@value='Add To Cart']")
	private WebElement TacoBellAddToCart;

	public WebElement getToscana() {
		return Toscana;
	}

	public WebElement getTacoBellAddToCart() {
		return TacoBellAddToCart;
	}
	
	@FindBy(xpath="//a[text()='Checkout']")
	private WebElement CheckButton;

	public WebElement getCheckButton() {
		return CheckButton;
	}


}
