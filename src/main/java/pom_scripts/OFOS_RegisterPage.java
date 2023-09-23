package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OFOS_RegisterPage extends BasePage{

	public OFOS_RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 @FindBy(linkText="Register")
	 private WebElement RegisterLink;
		 
	 @FindBy(name="username")
	 private WebElement UserTextfield;
	 
	 @FindBy(name="firstname")
	 private WebElement FirstnameTextField;
	 
	 @FindBy(name="lastname")
	 private WebElement LastnameTextField;
	 
	 @FindBy(name="email")
	 private WebElement emailTextField;
	 
	 @FindBy(name="phone")
	 private WebElement phoneTextField;
	 
	 @FindBy(name="password")
	 private WebElement PasswordTextField;
	 
	 @FindBy(name="cpassword")
	 private WebElement CpasswordTextField;
	 
	 @FindBy(name="address")
	 private WebElement AddressTextField;
	 
	 @FindBy(name="submit")
	 private WebElement RegisterButton;

	public WebElement getRegisterLink() {
		return RegisterLink;
	}

	public WebElement getUserTextfield() {
		return UserTextfield;
	}

	public WebElement getFirstnameTextField() {
		return FirstnameTextField;
	}

	public WebElement getLastnameTextField() {
		return LastnameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getCpasswordTextField() {
		return CpasswordTextField;
	}

	public WebElement getAddressTextField() {
		return AddressTextField;
	}

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

}



