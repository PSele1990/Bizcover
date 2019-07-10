package hudson;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC2_Applyjob extends Base_Page {
	@FindBy(xpath="//a[text()='Login']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@name='UserName']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='Password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement SignInbtn;
	
	@FindBy(xpath="//a[@href='https://au.hudson.com/user-dashboard']")
	private WebElement Dashboard1;
	
	@FindBy(xpath="//a[@href='/']")
	private WebElement Returnhome;
	
	@FindBy(xpath="//button[text()='Search Jobs']")
	private WebElement Searchjobs;
	
	@FindBy(xpath="//div[@class='search-result-top']")
	private List<WebElement> Jobs;
	
	/*@FindBy(xpath="(//div[@class='col-sm-8 col-xs-12'])[1]")
	private WebElement Jobtitle;  */
	
	 @FindBy(xpath="(//div[@class='col-sm-8 col-xs-12']/h3/a[@class='search-result-title'])[1]")
	 private WebElement Jobtitle;
	
	
	@FindBy(xpath="(//div[@class='job-apply-btn col-md-12'])[2]")
	private WebElement ApplyNow;
	
	@FindBy(xpath="(//input[@id='uploadresume'])[1]")
	private WebElement UploadResume;
	
	@FindBy(xpath="//input[@id='application-resume']")
	private WebElement Browse;
	
	@FindBy(xpath="//input[@name='privacypolicy']")
	private WebElement PrivacyPolicy;
	
	@FindBy(xpath="//input[@value='Apply Now']")
	private WebElement Applyjob;
	
	@FindBy(xpath="//h1[text()='Your job application has been submitted successfully.']")
	private WebElement Thankyoupage;
	
	@FindBy(xpath="//a[@title='View my profile']")
	private WebElement ViewProfile;

	
	@FindBy(xpath="//a[@title='Logout']")
	private WebElement Logout;
	
	public TC2_Applyjob(WebDriver driver)
	{
		super(driver);
	}
public void Clicksignin()
{
	signin.click();
}

public void Email(String un1)
{
	Email.sendKeys(un1);
}
public void Password(String pwd1)
{
	Password.sendKeys(pwd1);
}

public void SignInbtn()
{
	SignInbtn.click();
}

public void Dashboard1()
{
	String text= Dashboard1.getText();
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
public void Jobtitle()
{
	Jobtitle.click();
}

	
 public void ApplyNow()
{
	ApplyNow.click();
}

public void UploadResume()
{
	UploadResume.click();
}
public void Browse()
{
	Browse.sendKeys("E:\\Pavithra\\JXT_Issue\\Document\\Developer resume.docx");
}
public void PrivacyPolicy()
{
	PrivacyPolicy.click();
}

public void Applyjob()
{
	Applyjob.click();
}

public void Thankyoupage()
{
	String text= Thankyoupage.getText();
	System.out.println(text);
	if(text.contains(text))
	{
		System.out.println("Success");
	}
	else
	{
		System.out.println("Failed");
	}
	
}

public void ViewProfile()
{
	ViewProfile.click();
}

public void Logout()
{
	Logout.click();
}  

}

