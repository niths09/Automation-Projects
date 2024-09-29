package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageThree {

	public WebDriver driver;
	
	By title = By.xpath("//a[text()='Qafox.com']");
	By laptopsnotebooks = By.xpath("//*[text()='Laptops & Notebooks']");
	By dropdown = By.xpath("//*[text()='Show AllLaptops & Notebooks']");
	By laptopimage = By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a");
	By datefield = By.xpath("(//input[@class='form-control'])[2]");
	By quantity = By.xpath("//input[@name='quantity']");
	By addtocart = By.xpath("//button[@id='button-cart']");
	
	public ProductPageThree (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void Heading() {
		driver.findElement(title).click();
	}
	
	public void LaptopsAndNotebooks () {
		driver.findElement(laptopsnotebooks).click();
	}
	
	public void LaptopsDropDown() {
		driver.findElement(dropdown).click();
	}
	
	public void ProductClick() {
		driver.findElement(laptopimage).click();
	}
	
	public void ClearDeliveryDate () {
		driver.findElement(datefield).clear();
	}

	public void DeliveryDate (String date) {
		driver.findElement(datefield).sendKeys(date);
	}
	
	public void ClearQuantity() {
		driver.findElement(quantity).clear();
	}
	
	public void AddQuantity(String sendquantity) {
		driver.findElement(quantity).sendKeys(sendquantity);
	}
	
	public void CartButton() {
		driver.findElement(addtocart).click();
	}	
}
