package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OFOS_RestaurantPage extends BasePage{

	public OFOS_RestaurantPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[text()=\"Restaurants \"]")
	private WebElement RestaurantLink;
	
	@FindBy(xpath="(//a[text()=\"View Menu\"])[1]")
	private WebElement NorthStreetTarevrnRestaurant;
	
	@FindBy(xpath="(//a[text()=\"View Menu\"])[2]")
	private WebElement Eataly;
	
	@FindBy(xpath="(//a[text()=\"View Menu\"])[3]")
	private WebElement Nan_Xiang_Xiao_Long_Bao;
	
	@FindBy(xpath="(//a[text()=\"View Menu\"])[4]")
	private WebElement Highlands_Bar_and_Grill;
	
	@FindBy(xpath="(//a[text()=\"View Menu\"])[5]")
	private WebElement The_Cabana_Garden;
	
	@FindBy(xpath="(//a[text()=\"View Menu\"])[6]")
	private WebElement Toscana;

	public WebElement getRestaurantLink() {
		return RestaurantLink;
	}

	public WebElement getNorthStreetTarevrnRestaurant() {
		return NorthStreetTarevrnRestaurant;
	}

	public WebElement getEataly() {
		return Eataly;
	}

	public WebElement getNan_Xiang_Xiao_Long_Bao() {
		return Nan_Xiang_Xiao_Long_Bao;
	}

	public WebElement getHighlands_Bar_and_Grill() {
		return Highlands_Bar_and_Grill;
	}

	public WebElement getThe_Cabana_Garden() {
		return The_Cabana_Garden;
	}

	public WebElement getToscana() {
		return Toscana;
	}
	
}



