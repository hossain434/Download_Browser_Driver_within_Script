package downloadBrowserDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest {
	private WebDriver driver;

	@BeforeSuite
	public void setupDrivers() {
 // To declare and initialize HtmlUnitDriver
 WebDriver driver = new HtmlUnitDriver();
	}

	@Test
	public void test() {
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
