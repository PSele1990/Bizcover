package hudson;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public WebDriver driver;
	public static void CaptureScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
				
		String filename=new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
		
		File dest= new File("E:\\Pavithra\\Automation\\Hudson\\Hudson\\Screenshot_Hudson\\Image"+filename+".png");
		
		//File dest= new File("E:\\Pavithra\\Eclipse\\JXTnext\\Screenshots\\Screenshot.png");
		
		FileUtils.copyFile(src,dest);
		
		
	}

}
