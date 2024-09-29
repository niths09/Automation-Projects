package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountPage {

	public WebDriver driver;
		
	By accountdropdown = By.xpath("//span[text()='My Account']");
	By login = By.xpath("//*[text()='Login']");
	By email = By.xpath("//input[@id='input-email']");
	By password = By.xpath("//input[@id='input-password']");
	By submit = By.xpath("//input[@value='Login']");
	By currencydropdown = By.xpath("//i[@class='fa fa-caret-down']");
	By currency = By.xpath("//button[@name='EUR']");
		
	public AccountPage (WebDriver driver) {
		this.driver = driver;
	}
		
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
		
	public void AccountSelection () throws InterruptedException {
		WebElement account = driver.findElement(accountdropdown);
		account.click();
		Timer();
		WebElement loginoption = driver.findElement(login);
		loginoption.click();
		Timer();
	}
		
	public void EMailAddress (String emailid) {
		driver.findElement(email).sendKeys(emailid);
	}
		
	public void Password (String passcode) {
		driver.findElement(password).sendKeys(passcode);
	}
		
	public void Login () {
		driver.findElement(submit).click();;
	}
		
	public void CurrencySelection () throws InterruptedException {
		WebElement cash = driver.findElement(currencydropdown);
		cash.click();
		Timer();
		WebElement cashoption = driver.findElement(currency);
		cashoption.click();
	}	
}

