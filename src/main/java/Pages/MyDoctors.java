package Pages;

import io.appium.java_client.android.AndroidDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import java.appium_flutter_driver.FlutterFinder;

public class MyDoctors {
	AndroidDriver driver;
	public MyDoctors(AndroidDriver driver) {
      this.driver=driver;
        PageFactory.initElements(driver, this);
    }
	//FlutterFinder find;
	@FindBy(xpath="//android.view.View[@content-desc=\"My Appointments\"]")
	WebElement myAppointments;
	public void clickMyDoc() throws InterruptedException
	{
		
		Thread.sleep(3000);
		List <WebElement> MyDoctors = driver.findElements(By.className("android.view.View"));
		for(WebElement doc:MyDoctors) {
			String val=doc.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains("My Doctors")) {
				doc.click();
				break;
			}
		}
		Thread.sleep(3000);
		List <WebElement>  docList = driver.findElements(By.className("android.view.View"));
		for(WebElement doc:docList) {
			String val=doc.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains("Jenifer")) {
				doc.click();
				break;
			}
		}
		Thread.sleep(3000);
		myAppointments.click();
		Thread.sleep(3000);
	}
}
