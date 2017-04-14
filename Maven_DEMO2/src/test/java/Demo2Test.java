import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Demo2Test {
	
	@Test
	public void testApp() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com/");
		Thread.sleep(4000);
		System.out.println("Google Launched");
		driver.quit();
	}

}
