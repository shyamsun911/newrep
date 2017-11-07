import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlerts {

	public void jsalertsmethod() throws Throwable{
		// 
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='content']/ul/li[25]/a")).click();
		Thread.sleep(2500);
		
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[1]/button")).click();
		Thread.sleep(2500);
		//Click JSAlert
		Alert alert=driver.switchTo().alert();
        String textEdit = alert.getText();
        System.out.println(textEdit);
        alert.accept();
        Thread.sleep(1500);
        String succlick = driver.findElement(By.id("result")).getText();
        if(succlick.equalsIgnoreCase("You successfuly clicked an alert")){
        	System.out.println("Click JSAlert successfully");
        }
        else{
        	System.out.println("Click JSAlert Fail");
        }
               
        
        
        //Click JSConfirm
        driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[2]/button")).click();
		Thread.sleep(2500);
		String textEdit1 = alert.getText();
        System.out.println(textEdit1);
        alert.accept();
        
        String succlick1 = driver.findElement(By.id("result")).getText();
        if(succlick1.equalsIgnoreCase("You clicked: Ok")){
        	System.out.println("Click JSConfirm successfully");
        }
        else{
        	System.out.println("Click JSConfirm Fail");
        }
        
        
        
        //Click JSPrompt
        
        Thread.sleep(1500);
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[3]/button")).click();
		Thread.sleep(2500);
		//System.out.println(textEdit3);
        alert.sendKeys("test");
        alert.accept();
        Thread.sleep(1500);
        String succlick2 = driver.findElement(By.id("result")).getText();
        if(succlick2.equalsIgnoreCase("You entered: test")){
        	System.out.println("Click JSPrompt successfully");
        }
        else{
        	System.out.println("Click JSPrompt Fail");
        }
        
		
		
		//Close the browser
		driver.quit();
		
		
		
		
	}

}
