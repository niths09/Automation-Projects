package github_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	By username = By.xpath("//input[@id='user-name']");
	By password = By.xpath("//input[@id='password']");
	By submit = By.xpath("//input[@id='login-button']");
	
	public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void UserName (String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	
	public void PassWord (String pin) {
		driver.findElement(password).sendKeys(pin);
	}
	
	public void Login() {
		driver.findElement(submit).click();
	}
}
