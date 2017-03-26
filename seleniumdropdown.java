package seleniumbasic;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver",
				"C:/Users/parva/OneDrive/Documents/selenium driver/chromedriver_win32/chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		  //open rediff
		  driver.get("http://automate-apps.com/how-to-select-an-option-from-a-drop-down-using-selenium-web-driver/");
		  // manage speed 
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		 WebElement element = driver.findElement(By.id("month"));
		  Thread.sleep(1000);
		  Select select  = new  Select(element);
		  
		  select.selectByVisibleText("oct");
		  
		  driver.close();
		  
      

	
	}
}
