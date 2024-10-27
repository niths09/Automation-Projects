package github_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	public WebDriver driver;
	
	By sidebar = By.xpath("//button[@id='react-burger-menu-btn']");
	By signout = By.xpath("//a[@id='logout_sidebar_link']");

	public LogoutPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void Navigation() {
		driver.findElement(sidebar).click();
	}
	
	public void Logout() {
		driver.findElement(signout).click();
	}
}
