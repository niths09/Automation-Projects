package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageOne {

	public WebDriver driver;
	
	By iphoneproduct = By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a");
	By iphoneimage = By.xpath("(//img[@title='iPhone'])[2]");
	By nextbutton = By.xpath("(//button[@type='button'])[3]");
	By previousbutton = By.xpath("(//button[@type='button'])[2]");
	By closebutton = By.xpath("//button[@title='Close (Esc)']");
	By quantityfield = By.xpath("//input[@name='quantity']");
	By cartbutton = By.xpath("//button[@id='button-cart']");
	
	public ProductPageOne (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void MobileProduct() {
		driver.findElement(iphoneproduct).click();
	}
	
	public void IphoneImage() {
		driver.findElement(iphoneimage).click();
	}
	
	public void RightButton() {
		driver.findElement(nextbutton).click();
	}
	
	public void LeftButton() {
		driver.findElement(previousbutton).click();
	}
	
	public void CrossButton() {
		driver.findElement(closebutton).click();
	}
	
	public void ClearQuantityField() {
	    driver.findElement(quantityfield).clear();
	}
	
	public void QuantityField (String quantity) {
		driver.findElement(quantityfield).sendKeys(quantity);
	}
	
	public void AddToCart() {
		driver.findElement(cartbutton).click();
	}	
}
