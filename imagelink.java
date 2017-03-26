import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class imagelink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub WebDriver driver;
		String url="https://www.google.co.in/";
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		//int x=10;
	  WebElement input=driver.findElement(By.id("lst-ib"));
	  input.sendKeys("selenium webdriver");
	 // input.sendKeys(Keys.RETURN);
	  input.sendKeys(Keys.ENTER);	  
	  //driver.navigate().to("http://www.rediff.com");
	  driver.get("http://www.rediff.com");
	  System.out.println(driver.getTitle());
	  
	 
		//Thread.sleep(2000);
	  
   
       
	}

}
