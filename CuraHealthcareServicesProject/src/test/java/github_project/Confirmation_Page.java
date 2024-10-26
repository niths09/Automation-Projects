package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Confirmation_Page {

	public WebDriver driver;
	
	By homepagebutton = By.xpath("//*[text()='Go to Homepage']");
	
	public Confirmation_Page (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void Homepage() {
		driver.findElement(homepagebutton).click();
	}
}
