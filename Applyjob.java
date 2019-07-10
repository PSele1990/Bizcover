package hudson;

import java.io.IOException;

import org.testng.annotations.Test;

public class Applyjob extends Base_Test{
	
	@Test(enabled=false)
	public void testLoginLogout() throws InterruptedException, IOException
	{
		String un1=Excel.getCellValue(PATH,"LoginLogout", 1, 0);
		String pwd1=Excel.getCellValue(PATH,"LoginLogout", 1, 1);
	
	

	TC2_Applyjob tc2 = new TC2_Applyjob(driver);
		

	tc2.Clicksignin();
	Thread.sleep(1000);
	tc2.Email(un1);
	Thread.sleep(1000);
	tc2.Password(pwd1);
	tc2.SignInbtn();
	tc2.Dashboard1();
	tc2.Returnhome();
	tc2.Searchjobs();
	Thread.sleep(3000);
	tc2.Jobs();
	Thread.sleep(3000);
	tc2.Jobtitle();
	Screenshot.CaptureScreenshot(driver);
	tc2.ApplyNow();
	Thread.sleep(3000);
	Screenshot.CaptureScreenshot(driver);
	tc2.UploadResume();
	tc2.Browse();
	Screenshot.CaptureScreenshot(driver);
	tc2.PrivacyPolicy();
	tc2.Applyjob();
	Thread.sleep(5000);
	tc2.Thankyoupage();
	Screenshot.CaptureScreenshot(driver);
	Thread.sleep(5000);
	tc2.ViewProfile();
	Screenshot.CaptureScreenshot(driver); 
	tc2.Logout(); 
	
	
	
	}
	
}
