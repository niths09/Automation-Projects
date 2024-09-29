package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	public WebDriver driver;
	
	By billing = By.xpath("//input[@id='button-payment-address']");
	By deliverydetails = By.xpath("//input[@id='button-shipping-address']");
	By addcommentsone = By.xpath("(//textarea[@name='comment'])[1]");
	By deliverymethod = By.xpath("//input[@id='button-shipping-method']");
	By agree = By.xpath("//input[@type='checkbox']");
	By payment = By.xpath("//input[@id='button-payment-method']");
	By confirmbutton = By.xpath("//input[@id='button-confirm']");
	By finalsubmit = By.xpath("//a[@class='btn btn-primary']");
	
	public CheckoutPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void BillingContinue() {
		driver.findElement(billing).click();
	}
	
	public void DeliveryDetailsContinue() {
		driver.findElement(deliverydetails).click();
	}
	
	public void CommentFieldOne (String commentsone) {
		driver.findElement(addcommentsone).sendKeys(commentsone);
	}
	
	public void DeliveryMethodContinue() {
		driver.findElement(deliverymethod).click();
	}
	
	public void CheckBox() {
		driver.findElement(agree).click();
	}
	
	public void PaymentContinue() {
		driver.findElement(payment).click();
	}
	
	public void ConfirmOrder() {
		driver.findElement(confirmbutton).click();
		System.out.println("Your order has been successfully placed!");
	}
	
	public void Proceed() {
		driver.findElement(finalsubmit).click();
	}
}
