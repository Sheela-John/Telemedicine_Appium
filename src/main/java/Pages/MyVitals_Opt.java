package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class MyVitals_Opt {

	AndroidDriver driver;
	public MyVitals_Opt(AndroidDriver driver) {
     this.driver=driver;
       PageFactory.initElements(driver, this);
   }
	@FindBy(xpath="//android.view.View[@content-desc=\"My Vitals\"]")
	WebElement vitals;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]")
	WebElement fromDate;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]")
	WebElement toDate;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Switch to input\"]")
	WebElement fromEdit;
	
	public void VitalsMethos() throws InterruptedException
	{
		Thread.sleep(3000);
		vitals.click();
		Thread.sleep(3000);
		fromDate.click();
		Thread.sleep(2000);
		//fromEdit.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"8, Wednesday, February 8, 2023\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")).click();
		Thread.sleep(5000);
       List <WebElement> reports = driver.findElements(By.className("android.view.View"));
		for(WebElement rep:reports) {
			
			System.out.println(rep.getAttribute("content-desc"));
			String val=rep.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains("08-Feb-2023")) {
				 System.out.println("Success");
				break;
			}
		}
		toDate.click();
		Thread.sleep(2000);
		//fromEdit.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.view.View[@content-desc=\"16, Thursday, February 16, 2023\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"OK\"]")).click();
		Thread.sleep(5000);
       List <WebElement> reports1 = driver.findElements(By.className("android.view.View"));
		for(WebElement rep:reports1) {
			
			System.out.println(rep.getAttribute("content-desc"));
			String val=rep.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains("17-Feb-2023")) {
				 System.out.println("Error");
				//break;
			}
			
		
	}
	}
}
