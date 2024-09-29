package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComparisonPage {
	
	public WebDriver driver;
	
	By title = By.xpath("//a[text()='Qafox.com']");
	By phonesmenu = By.xpath("//*[text()='Phones & PDAs']");
	By phoneimageone = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a");
	By comparison = By.xpath("(//button[@class='btn btn-default'])[2]");
	By phoneimagetwo = By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[2]/div[1]/h4/a");
	By link = By.xpath("//*[text()='product comparison']");
	By addtocart = By.xpath("(//input[@value='Add to Cart'])[1]");
	By removeone = By.xpath("(//a[@class='btn btn-danger btn-block'])[2]");
	By removetwo = By.xpath("//*[text()='Remove']");
	By submit = By.xpath("//*[text()='Continue']");
	
	public ComparisonPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void HeadingName() {
		driver.findElement(title).click();
	}
	
	public void PhoneSelection() {
		driver.findElement(phonesmenu).click();
	}
	
	public void PhoneImageOne() {
		driver.findElement(phoneimageone).click();
	}
	
	public void ComparisonButton() {
		driver.findElement(comparison).click();
	}
	
	public void PhoneImageTwo() {
		driver.findElement(phoneimagetwo).click();
	}
	
	public void ComparisonLink() {
		driver.findElement(link).click();
	}
	
	public void AddToCart() {
		driver.findElement(addtocart).click();
	}
	
	public void RemoveButton() {
		driver.findElement(removeone).click();
	}
	
	public void RemoveItem() {
		driver.findElement(removetwo).click();
	}
	
	public void Continue() {
		driver.findElement(submit).click();
	}
}
