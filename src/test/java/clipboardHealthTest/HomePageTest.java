package clipboardHealthTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import clipboardHealthPages.HomePage;

public class HomePageTest  {
	
	public	static WebDriver driver = null;
	
	
	
	@BeforeTest
	public void setUpTest()
	{
		String projectPath =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/Drivers/chromedriver/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void NavigateToSamsungProductDetailView()
	{
		HomePage homepage= new HomePage(driver);
		homepage.goToUrl();
		homepage.Click_On_Hamburger_menu();
		homepage.Scroll_Upto_ShopyByDepartment();
		homepage.Click_On_Tv_Appliances_Link();
		homepage.Scroll_Upto_Television_Link();
		homepage.Scroll_Upto_Samsumge_Link();
		homepage.Click_Samsung_Check_Box();
	}
	
	
	@AfterTest
	
	public void teardown()
	{
		 driver.close();
		 driver.quit();
		 
	}


}
