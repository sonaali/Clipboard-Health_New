package clipboardHealthPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamsungProductPage  extends BasePage {
	
	WebDriver driver = null;
	By product_sort_menu = By.xpath("//span[@id='a-autoid-0-announce']");
	By product_price_title = By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2']");
	
	public SamsungProductPage(WebDriver driver)
	{
		super(driver);
		this.driver =driver;
	}
	
	// Click on Product Sort drop down
	public void Click_On_sort_menu()
	{		
		driver.findElement(product_sort_menu).click();		
	}
	
	//Move via link and click on 2nd option
	public void Clikc_Price_High_Low()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement listitem = driver.findElement(By.xpath("//a[@id='s-result-sort-select_2']"));
		 js.executeScript("arguments[0].scrollIntoView();", listitem);
		 listitem.click();
	}
	
	
	//Click on Highest second value 
	
	public void Click_Second_Highest_Price()
	{
		driver.findElement(product_price_title).click();
	}
	
	//Switch the Window
	public void MoveNewBrowserWindow()
	{ 
		// Store the current window handle
		 String winHandleBefore = driver.getWindowHandle();
		 Click_Second_Highest_Price();
		 implicitwait();
		 implicitwait();
		 
		// Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
				 }
				 
// Scroll down to "About this item" section
//				 JavascriptExecutor js = (JavascriptExecutor) driver;
//				  WebElement Elementmy = driver.findElement(By.xpath("//h1[contains(text(),'About this item')]"));
//			        
//			        js.executeScript("arguments[0].scrollIntoView();", Elementmy);
//			       // Elementmy.click();
//			        
//			        WebElement elementsss = driver.findElement(By.xpath("//h1[contains(text(),'About this item')]"));
//
//			        		 js = (JavascriptExecutor) elementsss;
//			        		    int yPosition = elementsss.getLocation().getY();
//
//			        		    for (int second = 0;; second++) {
//			        		        if(second >=4){
//			        		            break;
//			        		        }
//			        		        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,700)", "");
//			        		        
//			        		    }
//			        		   
}

}
