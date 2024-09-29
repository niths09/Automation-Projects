package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {

	public WebDriver driver;
	
	By titlename = By.xpath("//a[text()='Qafox.com']");
	By components = By.xpath("//*[text()='Components']");
	By monitors = By.xpath("//*[text()='Monitors (2)']");
	By applemonitor = By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a");
	
	public HeaderPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void TitleName() {
		driver.findElement(titlename).click();
	}
	
	public void ComponentsMenuBar() {
		driver.findElement(components).click();
	}
	
	public void MonitorsDropDown() {
		driver.findElement(monitors).click();
	}	
}
