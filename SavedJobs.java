package hudson;

import java.io.IOException;

import org.testng.annotations.Test;

public class SavedJobs extends Base_Test{
	@Test(enabled=false)
	public void testSavedJobs() throws IOException, InterruptedException
	{
		String un2=Excel.getCellValue(PATH,"LoginLogout", 1, 0);
		String pwd2=Excel.getCellValue(PATH,"LoginLogout", 1, 1);
		
		TC3_SaveJob tc3= new TC3_SaveJob(driver);
		tc3.Clicksignin();
		tc3.Email(un2);
		tc3.Password(pwd2);
		tc3.SignInbtn();
		tc3.Dashboard();
		tc3.Returnhome();
		tc3.Searchjobs();
		tc3.Jobs();
		tc3.SaveJob();
		Thread.sleep(2000);
		Screenshot.CaptureScreenshot(driver);
		tc3.ProfileView();
		tc3.SavedJobs();
		Thread.sleep(2000);
		Screenshot.CaptureScreenshot(driver);
		tc3.RemoveSavedjob();
		Screenshot.CaptureScreenshot(driver);
		tc3.Successmsg();
		tc3.Logout();
	}

}
