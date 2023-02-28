package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Logout {
	AndroidDriver driver;
	 
	public Logout(AndroidDriver driver) {
      this.driver=driver;
        PageFactory.initElements(driver, this);
    }
	@FindBy(xpath="//android.view.View[@content-desc=\"Logout\"]")
	WebElement logOut_Opt;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Logout\"]")
	WebElement Logout;
	
	public void logoutMethod() throws InterruptedException
	{
		Thread.sleep(2000);
		logOut_Opt.click();
		Thread.sleep(3000);
		Logout.click();
	}
}
