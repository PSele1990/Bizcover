package hudson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC1_LoginLogoutPage extends Base_Page{
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
	
	@FindBy(xpath="(//a[text()='Logout'])[1]")
	private WebElement Logout;
	
	
	public TC1_LoginLogoutPage(WebDriver driver)
	{
		super(driver);
	}

public void Clicksignin()
{
	signin.click();
}

public void Email(String un)
{
	Email.sendKeys(un);
}
public void Password(String pwd)
{
	Password.sendKeys(pwd);
}

public void SignInbtn()
{
	SignInbtn.click();
}

public void Dashboard()
{
	String text= Dashboard.getText();
	System.out.println(""+text);
	
	if(text.contains(text))
	{
		System.out.println("Pass");
	}
}


public void Logout()
{
	Logout.click();
}

}
