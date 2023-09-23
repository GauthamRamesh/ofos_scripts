package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OFOS_LoginPage extends BasePage{

	public OFOS_LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText="Login")
	private WebElement LoginLink;
	
	@FindBy(name="username")
	private WebElement LoginUserNameTextField;
	
	@FindBy(name="password")
	private WebElement LoginPasswordTextField;
	
	@FindBy(xpath="//input[@name=\"submit\"]")
	private WebElement LoginButton;

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getLoginUserNameTextField1() {
		return LoginUserNameTextField;
	}

	public WebElement getLoginPasswordTextField1() {
		return LoginPasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	

	

	

}



