package downloadBrowserDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest {
	private WebDriver driver;

	@Test
	public void test() {
		 WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");
		System.out.println("Google opened");
	}

}
