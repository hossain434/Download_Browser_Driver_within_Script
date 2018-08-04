package downloadBrowserDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest {
	private WebDriver driver;

	@BeforeSuite
	public void setupDrivers() {
		BrowsersDrivers.setupChrome();
	}

	@Test
	public void test() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
