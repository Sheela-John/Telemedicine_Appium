package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Medical {
	AndroidDriver driver;
	public Medical(AndroidDriver driver) {
     this.driver=driver;
       PageFactory.initElements(driver, this);
   }
	
	@FindBy(xpath="//android.view.View[@content-desc=\"Medical Tab 2 of 4\"]")
	WebElement MedicalBtn;
	@FindBy(xpath="(//android.widget.Button[@content-desc=\"Add\"])[1]")
	WebElement AddSurgeries;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	WebElement Suggestion;
	@FindBy(xpath="//android.view.View[@content-desc=\"Save\"]")
	WebElement save;
	@FindBy(xpath="(//android.widget.Button[@content-desc=\"Add\"])[1]")
	WebElement currentMed;
	@FindBy(xpath="(//android.widget.Button[@content-desc=\"Add\"])[2]")
	WebElement pastMed;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
	WebElement currentMedSug;
	@FindBy(xpath="(//android.widget.Button[@content-desc=\"Add\"])[4]")
	WebElement chronicDiseases;
	@FindBy(xpath="(//android.widget.Button[@content-desc=\"Add\"])[5]")
	WebElement injuries;
	@FindBy(xpath="(//android.widget.Button[@content-desc=\"Add\"])[6]")
	WebElement allergies;
	
	public void AddMedicalDetails() throws InterruptedException
	{
		Thread.sleep(4000);
		List <WebElement> buttons = driver.findElements(By.className("android.view.View"));
		for(WebElement button:buttons) {
			
			//stem.out.println(button.getAttribute("content-desc"));
			String val=button.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains("Medical")) {
				button.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		currentMed.click();
		Suggestion.click();
		driver.hideKeyboard();
		Suggestion.sendKeys("Paracetamol");
		driver.hideKeyboard();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(4000);
		pastMed.click();
		Suggestion.click();
		driver.hideKeyboard();
		Suggestion.sendKeys("Paracetamol");
		driver.hideKeyboard();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(4000);
		AddSurgeries.click();
		Suggestion.click();
		driver.hideKeyboard();
		Suggestion.sendKeys("Breast augmentation surgery");
		driver.hideKeyboard();
		Thread.sleep(4000);
		save.click();
		Thread.sleep(2000);
		chronicDiseases.click();
		Suggestion.click();
		driver.hideKeyboard();
		Suggestion.sendKeys("Bp");
		driver.hideKeyboard();
		Thread.sleep(4000);
		save.click();
		Thread.sleep(4000);
		injuries.click();
		Suggestion.click();
		driver.hideKeyboard();
		Suggestion.sendKeys("Knee Injury");
		driver.hideKeyboard();
		Thread.sleep(4000);
		save.click();
		Thread.sleep(4000);
		allergies.click();
		Suggestion.click();
		driver.hideKeyboard();
		Suggestion.sendKeys("Penecilin");
		driver.hideKeyboard();
		Thread.sleep(4000);
		save.click();
		Thread.sleep(4000);
	}
	
}
