package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OFOS_LogOutPage extends BasePage{

	public OFOS_LogOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement LogoutLink;
	public WebElement getLogoutLink() {
		return LogoutLink;
	}
	

}
