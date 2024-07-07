package StepPack;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import BasePack.BaseClass;
import Pom.Gear;
import Pom.Login;
import RunnerPack.RunnerClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends BaseClass{
	Actions action = new Actions(driver);
	Login l = new Login(driver);
	public static WebDriver driver = RunnerClass.driver;
	Gear g = new Gear(driver);


	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
		url(driver, "https://magento.softwaretestingboard.com/");
		Maximize();

	}
	@When("the user clicks on the Sign In button")
	public void the_user_clicks_on_the_sign_in_button() throws IOException {
		implicityWait();
		click(l.getSignin());

		ScreenShort(driver, "Screen1");


	}
	@When("the user enters their {string}")
	public void the_user_enters_their(String string) throws IOException {
		implicityWait();
		sendkeys(l.getUser(), "gayathridharaka@gmail.com");

		ScreenShort(driver, "Screen2");

	}
	@When("the user2 enters their {string}")
	public void the_user2_enters_their(String string) throws IOException {
		implicityWait();
		sendkeys(l.getPass(), "Gayathri123456");
		ScreenShort(driver, "Screen3");


	}
	@When("the user clicks the Login button")
	public void the_user_clicks_the_login_button() throws IOException {
		implicityWait();
		click(l.getSignin2());
		ScreenShort(driver, "Screen4");

	    
	}
	@When("the user clicks on the Gear section")
	public void the_user_clicks_on_the_gear_section() throws IOException {
		implicityWait();
		action.moveToElement(g.getGear()).perform();
		implicityWait();
		ScreenShort(driver, "Screen5");

		action.moveToElement(g.getWatches()).perform();
		implicityWait();
		ScreenShort(driver, "Screen6");

		click(g.getWatches());
		implicityWait();
		ScreenShort(driver, "Screen7");

		scroll(g.getScrollDownAimAnalogWatch());
		ScreenShort(driver, "Screen8");

		implicityWait();

		click(g.getClickDownAimAnalogWatch());
		ScreenShort(driver, "Screen9");

		implicityWait();

		ScreenShort(driver, "Screen10");
	  
	}
	@When("the user scrolls down to the Aim Analog Watch")
	public void the_user_scrolls_down_to_the_aim_analog_watch() throws IOException {
		scroll(g.getScrollAimAnalogwatch());
		ScreenShort(driver, "Screen11");

		implicityWait();
		click(g.getAddtoCart());
		ScreenShort(driver, "Screen12");

		NavigateBack();

	}
	@When("the user scrolls up to My Cart")
	public void the_user_scrolls_up_to_my_cart() throws IOException {
		scroll(g.getScrollUptoComapare());
		ScreenShort(driver, "Screen13");

	}
	@When("the user goes to their cart")
	public void the_user_goes_to_their_cart() throws InterruptedException, IOException {
		Thread.sleep(2000);
		click(g.getMyCart());
		ScreenShort(driver, "Screen14");

	}
	@When("the user views and edits their cart")
	public void the_user_views_and_edits_their_cart() throws IOException {
		click(g.getViewandEditCart());
		ScreenShort(driver, "Screen15");

	}
	@When("the user verifies the checkout page")
	public void the_user_verifies_the_checkout_page() throws IOException {
		scroll(g.getScrollToItems());

		NavigateBack();

		click(g.getMyCart());
		ScreenShort(driver, "Screen16");

	}
	@Then("the user removes the product from the cart")
	public void the_user_removes_the_product_from_the_cart() throws IOException {
		click(g.getRemove());
		ScreenShort(driver, "Screen17");

		click(g.getClickOk());
		ScreenShort(driver, "Screen18");

	}



}
