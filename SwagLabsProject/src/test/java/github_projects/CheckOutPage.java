package github_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

public WebDriver driver;
	
	By firstname = By.xpath("//input[@id='first-name']");
	By lastname = By.xpath("//input[@id='last-name']");
	By pincode = By.xpath("//input[@id='postal-code']");
	By submit = By.xpath("//input[@id='continue']");
	By finishbutton = By.xpath("//button[@name='finish']");
	By backbutton = By.xpath("//button[@name='back-to-products']");
	
	public CheckOutPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void FirstName (String fname) {
		driver.findElement(firstname).sendKeys(fname);
	}
	
	public void LastName (String lname) {
		driver.findElement(lastname).sendKeys(lname);
	}
	
	public void ZipCode (String pcode) {
		driver.findElement(pincode).sendKeys(pcode);
	}
	
	public void Continue() {
		driver.findElement(submit).click();
	}
	
	public void Finish() {
		driver.findElement(finishbutton).click();
	}
	
	public void Back() {
		driver.findElement(backbutton).click();
	}
}
