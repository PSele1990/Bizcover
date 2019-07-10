package hudson;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC3_SaveJob extends Base_Page {
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@name='UserName']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='Password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement SignInbtn;
	
	@FindBy(xpath="//a[@href='https://au.hudson.com/user-dashboard']")
	private WebElement Dashboard;
	
	@FindBy(xpath="//a[@href='/']")
	private WebElement Returnhome;
	
	@FindBy(xpath="//button[text()='Search Jobs']")
	private WebElement Searchjobs;
	
	@FindBy(xpath="//div[@class='search-result-top']")
	private List<WebElement> Jobs;
	
	@FindBy(xpath="(//div[@class='col-sm-4 col-xs-12 text-right']/span[@class='save-job'])[1]")
	private WebElement SaveJob;
	
	@FindBy(xpath="//a[@title='View my profile']")
	private WebElement ProfileView;
	
	@FindBy(xpath="(//*[@id='Main_C015_Col01']/div/div/div[1]/table/tbody/tr/td[2])[1]")
	private WebElement SavedJobs;
	
	@FindBy(xpath="(//a[@onclick='return confirmSaveJobDelete();'])[1]")
	private WebElement RemoveSavedjob;
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement Successmsg;
	
	@FindBy(xpath="//a[@title='Logout']")
	private WebElement Logout;
	
	
	public TC3_SaveJob(WebDriver driver)
	{
		super(driver);
	}

	public void Clicksignin()
	{
		signin.click();
	}

	public void Email(String un2)
	{
		Email.sendKeys(un2);
	}
	public void Password(String pwd2)
	{
		Password.sendKeys(pwd2);
	}

	public void SignInbtn()
	{
		SignInbtn.click();
	}

	public void Dashboard()
	{
		String text= Dashboard.getText();
		System.out.println(""+text);
	}
	public void Returnhome()
	{
		Returnhome.click();
	}
	public void Searchjobs()
	{
		Searchjobs.click();
		System.out.println("Success");
	}
	
	public void Jobs()
	{
		Iterator<WebElement> text=Jobs.iterator();

		while(text.hasNext())
		{
			System.out.println(text.next().getText());
			
			
			}
	}
	public void SaveJob()
	{
		SaveJob.click();
	}
	public void ProfileView()
	{
		ProfileView.click();
	}
	
	public void SavedJobs()
	{
		String text=SavedJobs.getText();
		System.out.println(text);
	}
	public void RemoveSavedjob()
	{
		RemoveSavedjob.click();
		
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}
	
	public void Successmsg()
	{
		System.out.println(Successmsg.getText());
	}

	public void Logout()
	{
		Logout.click();
	} 
	
	
	
	
	
	
	
	
	
}


