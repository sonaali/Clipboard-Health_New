package clipboardHealthPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	WebDriver driver = null;
	
	By hamburger_menu = By.cssSelector("a#nav-hamburger-menu");
	
	public HomePage(WebDriver driver)
	{   super(driver);
		this.driver =driver;
	}
	
	//Page actions
		
	// Click on Hamburger menu icon
	public void Click_On_Hamburger_menu()
	{
		driver.findElement(hamburger_menu).click();
		
	}
	
	//Page Scroll up to the Shop by department section
	
	public void Scroll_Upto_ShopyByDepartment()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ElementShopDepartment = driver.findElement(By.xpath("//div[contains(text(),'shop by department')]"));
		js.executeScript("arguments[0].scrollIntoView();",ElementShopDepartment);
	}
	
	//Click on TV, Appliances and Electronics link
	public void Click_On_Tv_Appliances_Link()
	{

		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement ElementsTV = driver.findElement(By.xpath("//div[contains(text(),'TV, Appliances, Electronics')]"));
	        js.executeScript("arguments[0].scrollIntoView();", ElementsTV);
	        ElementsTV.click();		 
	}
	
	//Locate on Television link and click
	public void Scroll_Upto_Television_Link()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement ElementTelivision = driver.findElement(By.xpath("//a[contains(text(),'Televisions')]"));
	     js.executeScript("arguments[0].scrollIntoView();", ElementTelivision);
	     ElementTelivision.click();		
	}
	
	//Page Scroll Up to Samsumg text
	public void Scroll_Upto_Samsumge_Link()
	{
		implicitwait();
		JavascriptExecutor js = (JavascriptExecutor) driver;

	        WebElement ElementSamsungLink = driver.findElement(By.xpath("//span[normalize-space()='Samsung']"));
	        
	        js.executeScript("arguments[0].scrollIntoView();", ElementSamsungLink);
	        ElementSamsungLink.click();
	        
      }
	
	//Click on Samsung check box
	public void Click_Samsung_Check_Box()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement ElementSamsungCkeckBox = driver.findElement(By.xpath("//span[normalize-space()='Samsung']"));
		 ElementSamsungCkeckBox.click();
		    
		    try {
 		    	js.executeScript("arguments[0].scrollIntoView();", ElementSamsungCkeckBox);
 		    	ElementSamsungCkeckBox.click();
 		    	
 		    	System.out.println("test pass");
 		    }   catch (StaleElementReferenceException e) {
 		    	
 		    	System.out.println(e);

		}
	}
	
	        		    
	        		   
}
	
	
	
	
	


