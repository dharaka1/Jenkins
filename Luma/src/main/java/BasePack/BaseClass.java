package BasePack;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static void url(WebDriver driver, String url) {
		driver.get(url);
	}

	public static void LaunchBrowser() {
		driver = new ChromeDriver();
	}

	public static void implicityWait() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	}

	public static void Maximize() {
		driver.manage().window().maximize();
	}

	public static void click(WebElement web) {
		web.click();
	}

	public static void ScreenShort(WebDriver driver2, String string) throws IOException {

		TakesScreenshot screen = (TakesScreenshot) driver2;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File path = new File(
				"C:\\Users\\91812\\Pictures\\Luma Project\\Automation and Manual testing Css Selector\\Luma\\Luma\\Luma\\Luma\\src\\test\\java\\LumaScreenShort.folder"
						+ string + ".png");
		FileUtils.copyFile(src, path);

	}

	public static void scroll(WebElement web) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", web);
	}

	public static void NavigateBack() {
		driver.navigate().back();
	}

	public void sendkeys(WebElement keys, String text) {
		keys.sendKeys(text);
	}

}
