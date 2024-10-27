package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout_Page {

public WebDriver driver;
	
	By sidebaroption = By.xpath("//a[@class='btn btn-dark btn-lg toggle']");
	By signout = By.xpath("//*[text()='Logout']");
	
	public Logout_Page (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void Navigation() {
		driver.findElement(sidebaroption).click();
	}
	
	public void LogOut() {
		driver.findElement(signout).click();
	}
}
