package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Doctors {
	AndroidDriver driver;
	public Doctors(AndroidDriver driver) {
      this.driver=driver;
        PageFactory.initElements(driver, this);
    }
	//FlutterFinder find;
	@FindBy(xpath="//android.view.View[@content-desc=\"My Appointments\"]")
	WebElement myAppointments;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText")
	WebElement search;

	public void clickDoc() throws InterruptedException
	{
		
		Thread.sleep(8000);
		List <WebElement> MyDoctors = driver.findElements(By.className("android.view.View"));
		for(WebElement doc:MyDoctors) {
			String val=doc.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.equals("Doctors")) {
				doc.click();
				break;
			}
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Search here with name or specialization\"]")).click();
		Thread.sleep(3000);
		driver.hideKeyboard();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.EditText[@text=\"Search here with name or specialization\"]")).sendKeys("Jenifer");
		Thread.sleep(3000);
		driver.hideKeyboard();
		Thread.sleep(6000);
		List <WebElement> Doctors = driver.findElements(By.className("android.view.View"));
		for(WebElement doc:Doctors) {
			String val=doc.getAttribute("content-desc");
			System.out.println(val);
			if(val==null)
			{
				continue;
			}
			else if(val.contains("Book Appointment")) {
				System.out.println("**");
				Thread.sleep(6000);
				doc.click();
				break;
			}
		}
		
		
	}
}
