import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadfile {

	public void uploadfilemethod() throws Throwable{


		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='content']/ul/li[15]/a")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.id("file-upload")).click();
		Thread.sleep(1500);
		
		Runtime.getRuntime().exec(System.getProperty("user.dir") + "//Drivers//fileupload.exe");
		Thread.sleep(1500);
		
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(1500);
		
		String succlick = driver.findElement(By.id("uploaded-files")).getText();
		
		System.out.println(succlick);
        if(succlick.equalsIgnoreCase("fileupload.html")){
        	System.out.println("Uploaded successfully");
        }
        else{
        	System.out.println("Upload Fail");
        }
        
		

		
		//Close the browser
		driver.quit();
		
	}

}
