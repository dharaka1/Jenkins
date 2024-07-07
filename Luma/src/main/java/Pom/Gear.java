package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gear {

	public static WebDriver driver;

	public Gear(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a#ui-id-6")
	private WebElement Gear;

	@FindBy(css = "a#ui-id-27 ")
	private WebElement Watches;

	@FindBy(css = " li:nth-child(9) ")

	private WebElement ScrollDownAimAnalogWatch;

	@FindBy(css = " li:nth-child(9) ")

	private WebElement ClickDownAimAnalogWatch;


	public WebElement getClickDownAimAnalogWatch() {
		return ClickDownAimAnalogWatch;
	}

	public WebElement getScrollDownAimAnalogWatch() {
		return ScrollDownAimAnalogWatch;
	}

	public void setScrollDownAimAnalogWatch(WebElement scrollDownAimAnalogWatch) {
		ScrollDownAimAnalogWatch = scrollDownAimAnalogWatch;
	}

	@FindBy(css = "	span.base")

	private WebElement scrollAimAnalogwatch;


	

	public WebElement getScrollAimAnalogwatch() {
		return scrollAimAnalogwatch;
	}

	@FindBy(css = "button#product-addtocart-button")

	private WebElement AddtoCart;
	

	@FindBy(css ="a[title=\"Remove item\"] ")

	private WebElement Remove;

	

	@FindBy(xpath ="//span[text()=\"OK\"] ")

	private WebElement ClickOk;
	
	public WebElement getClickOk() {
		return ClickOk;
	}

	public WebElement getRemove() {
		return Remove;
	}
	

	@FindBy(css = "li.item.link.compare")

	private WebElement ScrollUptoComapare;

	public WebElement getScrollUptoComapare() {
		return ScrollUptoComapare;
	}



	@FindBy(css = "a.action.showcart")

	private WebElement MyCart;

	@FindBy(css = "a.action.viewcart")

	private WebElement ViewandEditCart;

	@FindBy(css = "table#shopping-cart-table")

	private WebElement ScrollToItems;

	@FindBy(css = "	//li[@class=\"item link compare\"]")

	private WebElement ScollToCompare;

	public WebElement getScollToCompare() {
		return ScollToCompare;

	}

	@FindBy(css = "#product-addtocart-button")

	private WebElement Addtocart2;

	public WebElement getAddtocart2() {
		return Addtocart2;
	}


	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getScrollToItems() {
		return ScrollToItems;
	}

	public WebElement getViewandEditCart() {
		return ViewandEditCart;
	}

	public WebElement getMyCart() {
		return MyCart;
	}

	public WebElement getAddtoCart() {
		return AddtoCart;
	}

	public WebElement getGear() {
		return Gear;
	}

	public WebElement getWatches() {
		return Watches;
	}
	
}