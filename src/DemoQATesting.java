

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQATesting {

	ChromeDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://thedemosite.co.uk");
		
	}
	
	public void droppableTest() {
		WebElement droppable = driver.findElementByCssSelector("#menu-item-141");
	}
	
	
	@After
	public void end() {
		
		driver.close();
		driver.quit();
		
	}
}
