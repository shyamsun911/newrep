import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newwindow {

	public void newwindowmethod() throws Throwable{

		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='content']/ul/li[29]/a")).click();
		Thread.sleep(2500);
		
		//1multiple window
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Thread.sleep(2500);
		List<String> brotab = new ArrayList<String> (driver.getWindowHandles());
		//switching to new tab
		driver.switchTo().window(brotab .get(1));
		Thread.sleep(2500);
		System.out.println(driver.getTitle());
		
	driver.quit();
	}

}
