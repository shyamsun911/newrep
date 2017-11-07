import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageobject.pageobjectclass;

//http://the-internet.herokuapp.com

public class checkbox {
	//public static void main(String[] args) throws Throwable {
		
		public void checkboxmethod() throws Throwable{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			//	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://the-internet.herokuapp.com");
			Thread.sleep(4000);
			driver.findElement(By.xpath(pageobjectclass.chk1)).click();
			Thread.sleep(2500);
			
			java.util.List<WebElement> RdButton;
	
		 //find checkboxes
			RdButton = driver.findElements(By.xpath(pageobjectclass.chkboxes));	
		
		//Finding # of checkboxes
			int chksize = RdButton.size();
			System.out.println(chksize);
		// Navigating from first to last checkboxes
			for(int i=0; i < chksize ; i++ ){
			if(RdButton.get(i).isSelected()){
				System.exit(i);
			}
			else{
				RdButton.get(i).click();
				//Close the browser
				driver.quit();
				
			}
			
		}
			//Close the browser
			driver.quit();
					
	}	
		
}
