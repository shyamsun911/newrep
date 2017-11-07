import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Horizontalslide {

	public void horizontalmethod() throws Throwable{
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='content']/ul/li[21]/a")).click();
		Thread.sleep(2500);
		 
		
		WebElement des =driver.findElement(By.xpath(".//*[@id='content']/div/div/input"));
		
		Dimension slisize = des.getSize();
		  int sliWidth = slisize.getWidth();
		  
		int xCoord = des.getLocation().getX();

		  Actions builder = new Actions(driver);
		  builder.moveToElement(des)
		         .click()
		         .dragAndDropBy(des,xCoord+sliWidth, 0)
		         .build()
		         .perform();
		  
	    Thread.sleep(1500);
	
	    String st = driver.findElement(By.xpath(".//*[@id='content']/div/div/span")).getText();
	    System.out.println(st);
	    if(st.equals("5")){
        	System.out.println("dragged horizontal successfully");
        }
        else{
        	System.out.println("Horizontal Fail");
        }
	    
		//Close the browser
		driver.quit();
		
	}

}
