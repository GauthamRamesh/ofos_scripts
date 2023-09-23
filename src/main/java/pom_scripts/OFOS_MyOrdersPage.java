package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OFOS_MyOrdersPage extends BasePage{

	public OFOS_MyOrdersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//a[contains(@onclick,'cancel')])[1]")
	private WebElement DeleteIcon;

	public WebElement getDeleteIcon() {
		return DeleteIcon;
	}
	@FindBy(linkText="My Orders")
	private WebElement MyodersLink;

	public WebElement getMyodersLink() {
		return MyodersLink;
	}


}
