package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class History_Page {

	public WebDriver driver;
	
	By sidebaroption = By.xpath("//a[@class='btn btn-dark btn-lg toggle']");
	By historyoption = By.xpath("//*[text()='History']");
	By homepageoption = By.xpath("//*[text()='Go to Homepage']");
	
	public History_Page (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void Navigation() {
		driver.findElement(sidebaroption).click();
	}
	
	public void History() {
		driver.findElement(historyoption).click();
	}
	
	public void HomePageButton() {
		driver.findElement(homepageoption).click();
	}
}
