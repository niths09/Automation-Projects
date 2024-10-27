package github_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	public WebDriver driver;
	
	By cartbutton = By.xpath("//a[@data-test='shopping-cart-link']");
	By removebutton = By.xpath("//button[@name='remove-sauce-labs-bolt-t-shirt']");
	By checkoutbutton = By.xpath("//button[@name='checkout']");
	
	public CartPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void CartIcon() {
		driver.findElement(cartbutton).click();
	}
	
	public void RemoveIcon() {
		driver.findElement(removebutton).click();
	}
	
	public void CheckOutIcon() {
		driver.findElement(checkoutbutton).click();
	}
}
