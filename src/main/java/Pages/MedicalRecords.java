package Pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
public class MedicalRecords {
	AndroidDriver driver;
	public MedicalRecords(AndroidDriver driver) {
     this.driver=driver;
       PageFactory.initElements(driver, this);
   }
	@FindBy(xpath="//android.view.View[@content-desc=\"Medical Records\"]")
	WebElement medRecords;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]")
	WebElement addNewRec;
	@FindBy(xpath="//android.view.View[@content-desc=\"  Select file to upload\"]")
	WebElement selectfile;
	@FindBy(xpath="//android.view.View[@content-desc=\"Upload\"]")
	WebElement upload;
	@FindBy(xpath="//android.view.View[@content-desc=\"Browse File\"]")
	WebElement browse;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	WebElement image1;
	public void MedicalRecordsMethod() throws InterruptedException, IOException
	{
		driver.setFileDetector(new LocalFileDetector());
		Thread.sleep(3000);
		medRecords.click();
		Thread.sleep(2000);
		addNewRec.click();
		Thread.sleep(2000);
		browse.click();
		Thread.sleep(3000);
		image1.click();
		Thread.sleep(3000);
		upload.click();
		Thread.sleep(4000);
	}
}
