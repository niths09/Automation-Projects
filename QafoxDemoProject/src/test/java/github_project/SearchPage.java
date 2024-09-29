package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

	public WebDriver driver;
	
	By title = By.xpath("//a[text()='Qafox.com']");
	By search = By.xpath("//input[@name='search']");
	By searchbutton = By.xpath("//i[@class='fa fa-search']");
	
	public SearchPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void Heading() {
		driver.findElement(title).click();
	}
	
	public void SearchField(String searchitem) {
		driver.findElement(search).sendKeys(searchitem);;
	}
	
	public void SearchIcon() {
		driver.findElement(searchbutton).click();
	}	
}
