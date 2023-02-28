package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Notes {
	AndroidDriver driver;
	public Notes(AndroidDriver driver) {
     this.driver=driver;
       PageFactory.initElements(driver, this);
   }
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]")
	WebElement chiefComplaints;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[5]")
	WebElement examination;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[7]")
	WebElement advice;
	public void NotesMethod() throws InterruptedException
	{
		Thread.sleep(4000);
		List <WebElement> buttons = driver.findElements(By.className("android.view.View"));
		for(WebElement button:buttons) {
			String val=button.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains("Notes")) {
				button.click();
				break;
			}
		}
		Thread.sleep(2000);
		chiefComplaints.click();
		driver.hideKeyboard();
		Thread.sleep(2000);
		chiefComplaints.sendKeys("test");
		driver.hideKeyboard();
		Thread.sleep(2000);
		
		examination.click();
		driver.hideKeyboard();
		Thread.sleep(2000);
		examination.sendKeys("test");
		driver.hideKeyboard();
		Thread.sleep(2000);
		
		advice.click();
		driver.hideKeyboard();
		Thread.sleep(2000);
		advice.sendKeys("test");
		driver.hideKeyboard();
		Thread.sleep(4000);
		
		
		
	}
}
