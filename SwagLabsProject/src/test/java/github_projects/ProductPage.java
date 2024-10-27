package github_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	public WebDriver driver;
	
	By sortoption = By.xpath("//select[@data-test='product-sort-container']");
	By selectionone = By.xpath("(//div[@class='inventory_item_name '])[1]");
	By cartbuttonone = By.xpath("//button[@name='add-to-cart']");
	By cartbuttontwo = By.xpath("(//*[text()='Add to cart'])[2]");
	By cartbuttonthree = By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']");
	
	public ProductPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}

	public void FilterOne (String filteroptionone) {
		WebElement filterdropdownone = driver.findElement(sortoption);
		Select filterobjectone = new Select(filterdropdownone);
		filterobjectone.selectByVisibleText(filteroptionone);
	}
	
	public void ProductOne() {
		driver.findElement(selectionone).click();
	}
	
	public void AddItemOne() {
		driver.findElement(cartbuttonone).click();
	}
	
	public void FilterTwo (String filteroptiontwo) {
		WebElement filterdropdowntwo = driver.findElement(sortoption);
		Select filterobjectwo = new Select(filterdropdowntwo);
		filterobjectwo.selectByVisibleText(filteroptiontwo);
	}
	
	public void AddItemTwo() {
		driver.findElement(cartbuttontwo).click();
	}
	
	public void AddItemThree() {
		driver.findElement(cartbuttonthree).click();
	}
}
