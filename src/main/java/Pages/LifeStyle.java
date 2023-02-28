package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LifeStyle {
	AndroidDriver driver;
	public LifeStyle(AndroidDriver driver) {
     this.driver=driver;
       PageFactory.initElements(driver, this);
   }
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Add\"]")
	WebElement diet;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	WebElement Suggestion;
	@FindBy(xpath="//android.view.View[@content-desc=\"Save\"]")
	WebElement save;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Little to no exercise\"]")
	WebElement activity;
	public void lifeStyleMethod(String smoke,String act) throws InterruptedException
	{
		Thread.sleep(4000);
		List <WebElement> buttons = driver.findElements(By.className("android.view.View"));
		for(WebElement button:buttons) {
			String val=button.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains("Lifestyle")) {
				button.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		diet.click();
		Suggestion.click();
		driver.hideKeyboard();
		Suggestion.sendKeys("Paracetamol");
		driver.hideKeyboard();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(4000);
		List <WebElement> radio = driver.findElements(By.className("android.view.View"));
		for(WebElement button:radio) {
			String val=button.getAttribute("content-desc");
			if(val==null)
			{
				continue;
				
			}
			else
			{
			if(val.contains("Yes"))
			{
				if(smoke.contains("Yes"))
				{
					break;
				}
				else
				{
					button.click();
					break;
				}
			}
			else
			{
				if(smoke.contains("No"))
				{
					break;
				}
				else
				{
					button.click();
					break;
				}
			}
			
	}
}
		Thread.sleep(4000);
		activity.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\""+act+"\"]")).click();
		Thread.sleep(4000);
		save.click();
		Thread.sleep(4000);
	}
}
