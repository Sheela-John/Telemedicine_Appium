package Pages;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
public class Login {
	AndroidDriver driver;
	 
	public Login(AndroidDriver driver) {
      this.driver=driver;
        PageFactory.initElements(driver, this);
    }

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[1]")
	WebElement UserName;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText[2]")
	WebElement password;
	@FindBy(xpath="//android.view.View[@content-desc=\"Login\"]")
	WebElement submit;
	//public static AndroidDriver<WebElement> driver;
	
	public void loginMethod(String user,String pass) throws InterruptedException, MalformedURLException
	{
		

//		LoginBtn.click();
		Thread.sleep(2000);
		UserName.click();
		driver.hideKeyboard();
		UserName.sendKeys("ragul@gmail.com");
		driver.hideKeyboard();
		Thread.sleep(1000);
		password.click();
		driver.hideKeyboard();
		//Thread.sleep(5000);
		password.sendKeys("Roronoa@123");
		driver.hideKeyboard();
		Thread.sleep(5000);
		submit.click();
		Thread.sleep(5000);
		
		
	}

}
