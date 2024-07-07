package RunnerPack;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import BasePack.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\FeaturePack\\Luma.feature", glue = "StepPack", monochrome = true, dryRun = false)

public class RunnerClass extends BaseClass {

	@BeforeClass
	public static void start() {

	LaunchBrowser();
		Maximize();

	}
}
