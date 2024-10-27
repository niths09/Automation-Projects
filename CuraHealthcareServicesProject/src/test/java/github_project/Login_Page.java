package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_Page {

	public WebDriver driver;
	
	By sidemenubutton = By.xpath("//a[@class='btn btn-dark btn-lg toggle']");
	By signin = By.xpath("//*[text()='Login']");
	By usernamefield = By.xpath("(//input[@placeholder='Username'])[2]");
	By passwordfield = By.xpath("(//input[@placeholder='Password'])[2]");
	By loginbutton = By.xpath("//button[@type='submit']");
	
	public Login_Page (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void Navigation() {
		driver.findElement(sidemenubutton).click();
	}
	
	public void SignIn() {
		driver.findElement(signin).click();
	}
	
	public void Username (String uname) {
		driver.findElement(usernamefield).sendKeys(uname);
	}
	
	public void Password (String pin) {
		driver.findElement(passwordfield).sendKeys(pin);
	}
	
	public void Login() {
		driver.findElement(loginbutton).click();
	}
}
