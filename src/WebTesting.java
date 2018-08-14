import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTesting {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement searchBar = driver.findElementByCssSelector("#search_query_top");
		searchBar.sendKeys("Dress");
		WebElement searchButton = driver.findElementByCssSelector("#searchbox > button");
		searchButton.click();
		WebElement listOfItems = driver.findElementByCssSelector("#center_column > ul");
		assertTrue(listOfItems.isDisplayed());
	}
	
}
