import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicAuth {

	public void BasicAuthmethod() throws Throwable{
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(4000);
		Runtime.getRuntime().exec(System.getProperty("user.dir") + "//Drivers//handleauthwind.exe");
		driver.findElement(By.xpath(".//*[@id='content']/ul/li[2]/a")).click();
		Thread.sleep(2500);
		
		
		driver.quit();

	}

}
