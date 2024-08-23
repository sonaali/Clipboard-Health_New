package clipboardHealthPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import clipboardHealthConfig.DataProviderClass;

public class BasePage {
	
	WebDriver driver = null;
	
	DataProviderClass DB = new DataProviderClass();
	
	public BasePage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	//Common actions
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Direct to main Url
	public void goToUrl() {
		driver.get(DB.url);
		driver.manage().window().maximize();
	
	}
	
	//Direct Navigate to the samusung product page
	public void goToProductDetailView()
	{
		driver.get(DB.urldetail);
		driver.manage().window().maximize();
	}
	
	public void implicitwait()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	} 
	
		

}
