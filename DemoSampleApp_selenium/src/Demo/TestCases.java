import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class TestCases {
	public WebDriver driver;

	@BeforeMethod
	public void setup() {
						System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver.exe");
						driver = new ChromeDriver();
						driver.get("https://www.google.com/");
	}

	// Test to pass as to verify listeners .
	@Test
	public void VerifyTitle() {

		String welcometext = driver.getTitle();
		Assert.assertEquals(welcometext, "Google", "Text not found");
	}

	@Test
	public void VerifyHomePage() {

		//WebElement welcometext = driver.findElement(By.xpath("/html/body//img[@alt='Google']"));
		//Assert.assertTrue(welcometext, "Google not found");
		String welcometext = driver.getTitle();
		Assert.assertEquals(welcometext, "Google", "Text not found");
	}
	// Forcefully failed this test as to verify listener.
	@AfterMethod
	public void AfterTest() {
		driver.close();
	}
}