package src.test.java;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExampleTest {
	
	private WebDriver driver;
	
	@Test
	public void testTime() throws MalformedURLException {
		new DesiredCapabilities();
		DesiredCapabilities dr = DesiredCapabilities.firefox();
		
		
		
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dr);
		
		driver.navigate().to("http://gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Email']")) .sendKeys("username");
		
		driver.quit();

	}
	
}
