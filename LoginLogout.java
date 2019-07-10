package hudson;

import java.io.IOException;

import org.testng.annotations.Test;

public class LoginLogout extends Base_Test {
	
@Test(priority=1)
public void testLoginLogout() throws InterruptedException, IOException
	{	
	String un=Excel.getCellValue(PATH,"LoginLogout", 1, 0);
	String pwd=Excel.getCellValue(PATH,"LoginLogout", 1, 1); 
		
	TC1_LoginLogoutPage tc1= new TC1_LoginLogoutPage(driver);

	tc1.Clicksignin();
	Thread.sleep(1000);
	tc1.Email(un);
	Thread.sleep(1000);
	tc1.Password(pwd);
	Screenshot.CaptureScreenshot(driver);
	tc1.SignInbtn();
	Screenshot.CaptureScreenshot(driver);
	tc1.Dashboard();
	Screenshot.CaptureScreenshot(driver);
	tc1.Logout(); 
	
	 
	
	}
}

        
