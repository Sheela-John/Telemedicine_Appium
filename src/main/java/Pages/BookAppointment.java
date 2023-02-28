package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class BookAppointment {
	AndroidDriver driver;
	 
	public BookAppointment(AndroidDriver driver) {
      this.driver=driver;
        PageFactory.initElements(driver, this);
    }
	@FindBy(xpath="//android.view.View[@content-desc=\"In-Clinic\"]")
	WebElement InClinic;
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Confirm\"]")
	WebElement confirm;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
	WebElement reason;
	@FindBy(xpath="//android.view.View[@content-desc=\"Okay\"]")
	WebElement okay;
	@FindBy(xpath="//android.view.View[@content-desc=\"Pay\"]")
	WebElement pay;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")
	WebElement phone;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText")
	WebElement email;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
	WebElement proceed;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.ListView/android.view.View[3]")
	WebElement netBank;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View")
	WebElement icici;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")
	WebElement payNow;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[2]/android.widget.Button[1]")
	WebElement success;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText")
	WebElement cardNumber;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText")
	WebElement expiry;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.EditText")
	WebElement cardHoldersName;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]/android.widget.EditText")
	WebElement cvv;
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]/android.view.View[5]")
	WebElement saveCardForFuture;
	@SuppressWarnings("deprecation")
	public void bookAppointment(String hospitalname,String date,String time) throws InterruptedException
	{
		Thread.sleep(3000);
		List <WebElement> hospitals = driver.findElements(By.className("android.view.View"));
		for(WebElement hos:hospitals) {
			String val=hos.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains(hospitalname)) {
				
				System.out.println("*");
				Thread.sleep(3000);
				hos.click();
				break;
			}
		}
		Thread.sleep(5000);
		List <WebElement> appDate = driver.findElements(By.className("android.view.View"));
		for(WebElement app:appDate) {
			
			//System.out.println(app.getAttribute("content-desc"));
			String val=app.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains(date)) {
				
				System.out.println("*");
				Thread.sleep(3000);
				app.click();
				break;
			}

		}
		Thread.sleep(3000);
		List <WebElement> appTime = driver.findElements(By.className("android.view.View"));
		for(WebElement app:appTime) {
			
			String val=app.getAttribute("content-desc");
			if(val==null)
			{
				continue;
			}
			else if(val.contains(time)) {
				
				System.out.println("*");
				Thread.sleep(3000);
				app.click();
				break;
			}
		}
		Thread.sleep(3000);
		confirm.click();
		Thread.sleep(3000);
		reason.click();
		Thread.sleep(3000);
		driver.hideKeyboard();
		Thread.sleep(3000);
		reason.sendKeys("Test");
		Thread.sleep(3000);
		driver.hideKeyboard();
		Thread.sleep(6000);
		okay.click();
		Thread.sleep(5000);
		pay.click();
		Thread.sleep(3000);
		razorPay("Card Visa, MasterCard, RuPay, and Maestro","ICICI","","");
		//driver.hideKeyboard();
	}
	public void razorPay(String payMethod,String bankName,String walletName,String payLater) throws InterruptedException
	{
		Thread.sleep(15000);
//		phone.sendKeys("1234567890");
//		Thread.sleep(2000);
//		email.sendKeys("test@gmail.com");
//		Thread.sleep(3000);
//		proceed.click();
//		Thread.sleep(5000);
		
		switch(payMethod) {
		
		case "Card Visa, MasterCard, RuPay, and Maestro":
		{
			driver.findElement(By.xpath("//android.view.View[@text=\""+payMethod+"\"]")).click();
			Thread.sleep(3000);
			cardNumber.click();
			Thread.sleep(3000);
			driver.hideKeyboard();
			Thread.sleep(3000);
			cardNumber.sendKeys("4111111111111111");
			driver.hideKeyboard();
			Thread.sleep(3000);
			Thread.sleep(2000);
			expiry.sendKeys("1125");
			Thread.sleep(2000);
			cardHoldersName.sendKeys("mobile Test");
			Thread.sleep(2000);
			cvv.sendKeys("111");
			Thread.sleep(2000);
			saveCardForFuture.click();
			Thread.sleep(2000);
			payNow.click();
		}
		case "UPI & More":
		{
			driver.findElement(By.xpath("//android.view.View[@text=\""+payMethod+"\"]")).click();
		}
		case "Netbanking All Indian banks":
		{
			driver.findElement(By.xpath("//android.view.View[@text=\""+payMethod+"\"]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=\""+bankName+"\"]")).click();
			Thread.sleep(4000);
			payNow.click();
		}
		case "Wallet Mobikwik & More":
		{
			driver.findElement(By.xpath("//android.view.View[@text=\""+payMethod+"\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.TextView[@text=\""+walletName+"\"]")).click();
			Thread.sleep(4000);
			payNow.click();
		}
		case "Pay Later Simpl, LazyPay, ICICI & More":
		{
			driver.findElement(By.xpath("//android.view.View[@text=\""+payMethod+"\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.view.View[@text=\""+payLater+"\"]")).click();
			
		}
		
		}
		
		
		
		
		Thread.sleep(5000);
		success.click();
	}
	
}
