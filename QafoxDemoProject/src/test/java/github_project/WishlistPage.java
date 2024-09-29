package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {

	public WebDriver driver;
	
	By titleheading = By.xpath("//a[text()='Qafox.com']");
	By camerasmenu = By.xpath("//*[text()='Cameras']");
	By cameraimage = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a");
	By wishlistbuttonone = By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[1]");
	By laptopsnotebooks = By.xpath("//*[text()='Laptops & Notebooks']");
	By dropdown = By.xpath("//*[text()='Show AllLaptops & Notebooks']");
	By sonyimage = By.xpath("//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[1]/h4/a");
	By wishlistbuttontwo = By.xpath("(//button[@class='btn btn-default'])[1]"); 
	By mainwishlist = By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[4]");
	By removebutton = By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[6]/a/i");
	By continuebutton = By.xpath("//a[@class='btn btn-primary']");
	
	public WishlistPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void HeadingName() {
		driver.findElement(titleheading).click();
	}
	
	public void CameraMenu() {
		driver.findElement(camerasmenu).click();
	}
	
	public void CameraClick() {
		driver.findElement(cameraimage).click();
	}
	
	public void WishlistOne() {
		driver.findElement(wishlistbuttonone).click();
	}
	
	public void AllLaptopsNotebooks () {
		driver.findElement(laptopsnotebooks).click();
	}
	
	public void ShowDropDown() {
		driver.findElement(dropdown).click();
	}
	
	public void LaptopSelection() {
		driver.findElement(sonyimage).click();
	}
	
	public void WishlistTwo() {
		driver.findElement(wishlistbuttontwo).click();
	}
	
	public void AddToWishList() {
		driver.findElement(mainwishlist).click();
	}
	
	public void RemoveButton() {
		driver.findElement(removebutton).click();
	}
	
	public void ContinueButton() {
		driver.findElement(continuebutton).click();
	}	
}
