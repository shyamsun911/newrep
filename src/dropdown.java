import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import pageobject.pageobjectclass;

public class dropdown {
	
	public void dropdownmethod() throws Throwable{
		
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pageobjectclass.drp1)).click();
		Thread.sleep(2500);
		
		WebElement dropList1=driver.findElement(By.id(pageobjectclass.drpdown));
		List<WebElement> options = dropList1.findElements(By.tagName(pageobjectclass.drpoptions));
		
		for(int i=0;i<options.size();i++){
			System.out.println(options.get(i).getText());//+" -- "+options.get(i).getAttribute("selected"));
				String str = options.get(i).getText();
				
		//*************//*
		Select sdrop=  new Select(dropList1);
		
		
		if(str.equals("Option 1")){
		sdrop.selectByVisibleText(str);
		}
		
		Thread.sleep(2000);
		if(str.equals("Option 2")){
			sdrop.selectByIndex(i);
			}
		}
		
		//Close the browser
		driver.quit();
		
		
	}
}