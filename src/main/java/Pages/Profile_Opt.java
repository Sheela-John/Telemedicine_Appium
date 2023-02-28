package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Profile_Opt {
	AndroidDriver driver;
	public Profile_Opt(AndroidDriver driver) {
     this.driver=driver;
       PageFactory.initElements(driver, this);
   }
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[4]/android.widget.EditText")
	WebElement Name;
	@FindBy(xpath="//android.view.View[@content-desc=\"Female\"]/android.widget.RadioButton")
	WebElement Female;
	@FindBy(xpath="//android.view.View[@content-desc=\"175cm\"]")
	WebElement height;
	@FindBy(xpath="//android.view.View[@content-desc=\"170cm\"]")
	WebElement changeHeight;
	@FindBy(xpath="//android.view.View[@content-desc=\"75kg\"]")
	WebElement weight;
	@FindBy(xpath="//android.view.View[@content-desc=\"70kg\"]")
	WebElement changeWeight;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"A+\"]")
	WebElement blood;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View[16]")
	WebElement dob;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.widget.EditText[2]")
	WebElement location;
	@FindBy(xpath="//android.view.View[@content-desc=\"Save\"]")
	WebElement save;
	public void changeProfile(String name,String bloodType,String loc) throws InterruptedException
	{
		Name.click();
		
		Name.clear();
		
		Name.sendKeys(name);
	
		driver.hideKeyboard();
		//dob.click();
		//dob.sendKeys("08-Feb-1994");
		Thread.sleep(3000);
		blood.click();
		Thread.sleep(3000);
		System.out.println(bloodType);
	
		driver.findElement(By.xpath("//android.view.View[@content-desc=\""+bloodType+"\"]")).click();
		
	       
		location.click();
		Thread.sleep(3000);
		driver.hideKeyboard();
		location.clear();
		location.sendKeys(loc);
		driver.hideKeyboard();
		
		 save.click();
		 Thread.sleep(8000);  
	}
}
