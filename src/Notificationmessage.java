import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.html.Image;

public class Notificationmessage {

	public void notificationmessagemethod() throws Throwable{
		

		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='content']/ul/li[31]/a")).click();
		Thread.sleep(2500);
		
		String str = driver.findElement(By.id("flash")).getText();
		
		System.out.println("BEFORE CLICK" +"  "+str );
		driver.findElement(By.xpath(".//*[@id='content']/div/p/a")).click();
		String str1 = driver.findElement(By.xpath("//*[@id='flash-messages']")).getText();
		System.out.println("AFTER CLICK" +" "+str1 );
		Thread.sleep(2000);
		
		driver.quit();	
	}
	
}
