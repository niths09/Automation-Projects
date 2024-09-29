package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageTwo {

	public WebDriver driver;
	
	By samsungmonitor = By.xpath("//*[@id=\"content\"]/div[3]/div[2]/div/div[2]/div[1]/h4/a");
	By quantity = By.xpath("//input[@name='quantity']");
	By addtocart = By.xpath("//button[@id='button-cart']");
	
	public ProductPageTwo (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void SamsungMonitorProduct() {
		driver.findElement(samsungmonitor).click();
	}
	
	public void ClearQuantityField() {
	    driver.findElement(quantity).clear();
	}
	
	public void QuantityField(String addquantity) {
		driver.findElement(quantity).sendKeys(addquantity);;
	}
	
	public void CartButton() {
		driver.findElement(addtocart).click();
	}	
}
