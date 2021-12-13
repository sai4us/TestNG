package Formation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ConnectionTest {
	
	private WebDriver driver;
	
  @Test
  public void demoTest() {
	  
	  driver.get("http://demo.guru99.com/test/guru99home/");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();	
	  Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
