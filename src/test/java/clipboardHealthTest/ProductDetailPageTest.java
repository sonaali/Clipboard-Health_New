package clipboardHealthTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;

import clipboardHealthPages.SamsungProductPage;

public class ProductDetailPageTest {
	
	public	static WebDriver driver = null;
	
	
	@BeforeTest
	public void setUpTest()
	{
		String projectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void SelectProdutFromList()
	{
		SamsungProductPage produtSam = new SamsungProductPage(driver);
		produtSam.goToProductDetailView();
		produtSam.Click_On_sort_menu();
		produtSam.Click_Second_Highest_Price();
		produtSam.MoveNewBrowserWindow();
		
	}
	
	
	@AfterTest
	
	public void teardown()
	{
		 driver.close();
		 driver.quit();
		 
	}

}
