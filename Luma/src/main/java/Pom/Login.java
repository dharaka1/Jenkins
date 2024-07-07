package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePack.BaseClass;

public class Login extends BaseClass {

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "li.authorization-link")
	private WebElement Signin;

	@FindBy(css = "#email")
	private WebElement user;

	@FindBy(css = "input[name='login[password]']")
	private WebElement Pass;

	@FindBy(css = "button#send2 ")
	private WebElement Signin2;

	public WebElement getSignin() {
		return Signin;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return Pass;
	}

	public WebElement getSignin2() {
		return Signin2;
	}

}
