package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Options {
	AndroidDriver driver;
	public Options(AndroidDriver driver) {
     this.driver=driver;
       PageFactory.initElements(driver, this);
   }
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button")
	WebElement OptionsBtn;
	@FindBy(xpath="//android.view.View[@content-desc=\"Profile\"]")
	WebElement profile;
	public void clickOptions()
	{
		OptionsBtn.click();
	}
	public void clickProfile()
	{
		profile.click();
	}
}
