package Testcases;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testsigma.flutter.FlutterFinder;

import Pages.BookAppointment;
import Pages.Doctors;
import Pages.LifeStyle;
//import appium_flutter_driver.FlutterFinder;
//import appium_flutter_driver.finder.FlutterElement;
import Pages.Login;
import Pages.Logout;
import Pages.Medical;
import Pages.MyDoctors;
import Pages.MyVitals_Opt;
import Pages.Notes;
import Pages.Options;
import Pages.Profile_Opt;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestCase_Login {
	AndroidDriver driver;
	 FlutterFinder find;
		@BeforeClass
		public void Setup() throws MalformedURLException, InterruptedException{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			  
	// Set your device name capabilities.setCapability("no",true);
	        capabilities.setCapability("newCommandTimeout", 100000);
	        capabilities.setCapability("noReset", true);
	        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	    	//capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Flutter");
	    	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "HT73W0200482");
	    	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	    	capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
	        capabilities.setCapability("noRest", true);
	capabilities.setCapability("appPackage", "com.deemsysinc.telemedicinecustomer");
	capabilities.setCapability("appActivity","com.example.telemedicinecustomer.MainActivity");
	// Set BROWSER_NAME desired capability.
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
   driver=new AndroidDriver(url,capabilities);
   


	//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
		}

		@Test
	public void LoginTest() throws InterruptedException, MalformedURLException
	{
		Login log=new Login(driver);
		log.loginMethod("ragul@gmail.com","Roronoa@123");
		
	}
		@Test
		public void OptionsTest() throws InterruptedException, MalformedURLException
		{
//		Login log=new Login(driver);
//			log.loginMethod("ragul@gmail.com","Roronoa@123");
			Options opt=new Options(driver);
			opt.clickOptions();
			opt.clickProfile();
			Profile_Opt popt=new Profile_Opt(driver);
			popt.changeProfile("Rahul1","B+","coimbatore");
		}
		@Test
		public void MedicalTest() throws InterruptedException, MalformedURLException
		{
			Options opt=new Options(driver);
			opt.clickOptions();
			opt.clickProfile();
			Thread.sleep(4000);
			Medical med=new Medical(driver);
			med.AddMedicalDetails();
			
		}
	@Test
	public void MyDocTest() throws MalformedURLException, InterruptedException
	{	
		MyDoctors doc=new MyDoctors(driver);
		doc.clickMyDoc();
	}
	@Test
	public void MyVitals() throws InterruptedException
	{
		Options opt=new Options(driver);
		opt.clickOptions();
		MyVitals_Opt vit=new MyVitals_Opt(driver);
		vit.VitalsMethos();
	}
	@Test
	public void LifeStyleTest() throws InterruptedException
	{
		Options opt=new Options(driver);
		opt.clickOptions();
		opt.clickProfile();
		Thread.sleep(4000);
		LifeStyle life=new LifeStyle(driver);
		life.lifeStyleMethod("Yes","Light Exercise");			
	}
	@Test
	public void NotesTest() throws InterruptedException 
	{
		Options opt=new Options(driver);
		opt.clickOptions();
		opt.clickProfile();
		Thread.sleep(4000);
		Notes note=new Notes(driver);
		note.NotesMethod();
	}
	
	@Test
	public void MedicalRecords() throws InterruptedException, IOException
	{
		Options opt=new Options(driver);
		opt.clickOptions();
		Pages.MedicalRecords med=new Pages.MedicalRecords(driver);
		med.MedicalRecordsMethod();
	}
	@Test
	public void LogoutTest() throws InterruptedException
	{
		Options opt=new Options(driver);
		opt.clickOptions();
		Logout log=new Logout(driver);
		log.logoutMethod();
	}
	@Test
	public void bookAppointment() throws MalformedURLException, InterruptedException
	{
		MyDocTest();
		BookAppointment book=new BookAppointment(driver);
		book.bookAppointment("Glow", "MAR\n3", "06:30 AM");
	}
	@Test
	public void DoctorsTest() throws InterruptedException
	{
		Doctors doc=new Doctors(driver);
		doc.clickDoc();
	}
		
}
