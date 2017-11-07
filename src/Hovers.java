import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hovers {

	public void Hoversmethod() throws Throwable{
		
		//System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
//		WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new ChromeDriver();
		//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='content']/ul/li[22]/a")).click();
		Thread.sleep(2500);
		
		List<WebElement> Hoverss;
		
		Hoverss = driver.findElements(By.xpath(".//*[@id='content']/div/div"));
				 
		int chksize = Hoverss.size();
		
		
		
		for (WebElement item : Hoverss) {
		    System.out.println(item);
		    
		    Actions act = new Actions(driver);
		    
	        act.moveToElement(item).build().perform();
	        Thread.sleep(2000);
	        //try {    
	        String selectAll = Keys.chord(Keys.SHIFT,Keys.RETURN);
	        
	        
	        WebElement clickprofile = driver.findElement(By.linkText("View profile"));
	        
	        act.moveToElement(clickprofile);
	 
	        act.contextClick(clickprofile);
	        
	 
	        act.perform();
	        act.sendKeys(selectAll);
	        // Thread.sleep(2000);
	        // driver.navigate().back();
	        // Thread.sleep(5000);
	        /*}
	        catch(org.openqa.selenium.StaleElementReferenceException ex)
	        {
	        	 act.moveToElement(item).build().perform();
	 	        Thread.sleep(2000);
	        	WebElement clickprofile = driver.findElement(By.linkText("View profile"));
		        
		        act.moveToElement(clickprofile);
		 
		        act.click();
		 
		        act.perform();
		        
		        Thread.sleep(2000);
		        driver.navigate().back();
		        Thread.sleep(5000);
	        }*/
		    //driver.navigate().refresh();
	        /*java.util.List<WebElement> RdButton = driver.findElements(By.xpath(".//*[@id='content']/div/div"));	
			
			//Finding # of checkboxes
				int chksize1 = RdButton.size();
			
			// Navigating from first to last checkboxes
				for(int ij=0; ij < chksize1 ; ij++ ){
				RdButton.get(ij).click();*/
					
								
		}
		
		//Close the browser
		driver.quit();
	}
	
	
}
