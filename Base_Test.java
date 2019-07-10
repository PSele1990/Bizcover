package hudson;



import java.io.IOException;

//import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
//import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_Const{

public WebDriver driver;
	static
	{
		System.setProperty(CHROME_key, CHROME_value);
	}
			
	
	@BeforeMethod
	public void OpenAppln() 
	{
		
	driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.navigate().refresh();
	//driver.navigate().to("file:///E:/Pavithra/JXT_Issue/Cache.html");
	System.out.println("Cleared");
	driver.manage().window().maximize();
	driver.get("https://au.hudson.com/");
	}
	
	@AfterMethod
	public void CloseApp(ITestResult r) throws IOException
	{
		int status =r.getStatus();
		if(status==1)
		{
			Screenshot.CaptureScreenshot(driver);
		}
		else
		{
			Screenshot.CaptureScreenshot(driver);
		}
	driver.quit();
	} 
}

	

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
