package github_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;
	
	By twitter = By.xpath("//a[@data-test='social-twitter']");
	By facebook = By.xpath("//a[@data-test='social-facebook']");
	By linkedin = By.xpath("//a[@data-test='social-linkedin']");
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void TwitterLogo() {
		driver.findElement(twitter).click();
	}
	
	public void FacebookLogo() {
		driver.findElement(facebook).click();
	}
	
	public void LinkedinLogo() {
		driver.findElement(linkedin).click();
	}
}
