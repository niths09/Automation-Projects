package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	public WebDriver driver;
	
	By cartbutton = By.xpath("//*[text()='Shopping Cart']");
	By removeone = By.xpath("(//button[@class='btn btn-danger'])[1]");
	By removetwo = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]/i");
	By removethree = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr[1]/td[4]/div/span/button[2]/i");
	By quantityupdate = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/input");
	By quantityrefresh = By.xpath("//button[@type='submit']");
	By addresspanel = By.xpath("(//a[@class='accordion-toggle'])[2]");
	By quote = By.xpath("//button[@id='button-quote']");
	By radiobutton = By.xpath("//input[@name='shipping_method']");
	By applyshipping = By.xpath("//input[@value='Apply Shipping']");
	By proceedbutton = By.xpath("//a[@class='btn btn-primary']");
	
	public CartPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void AddToCart() {
		driver.findElement(cartbutton).click();
	}
	
	public void RemoveButtonOne() {
		driver.findElement(removeone).click();
	}
	
	public void RemoveButtonTwo() {
		driver.findElement(removetwo).click();
	}
	
	public void RemoveButtonThree() {
		driver.findElement(removethree).click();
	}
	
	public void ClearQuantity() {
		driver.findElement(quantityupdate).clear();
	}
	
	public void AddQuantity (String quantity) {
		driver.findElement(quantityupdate).sendKeys(quantity);
	}
	
	public void RefreshQuantity() {
		driver.findElement(quantityrefresh).click();
	}
	
	public void ShippingToggle() {
		driver.findElement(addresspanel).click();
	}
	
	public void GetQuotes() {
		driver.findElement(quote).click();
	}
	
	public void QuoteRadio() {
		driver.findElement(radiobutton).click();
	}
	
	public void ApplyShipping() {
		driver.findElement(applyshipping).click();
	}
	
	public void CheckOut() {
		driver.findElement(proceedbutton).click();
	}
}
