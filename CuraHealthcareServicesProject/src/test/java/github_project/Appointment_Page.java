package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Appointment_Page {

	public WebDriver driver;
	
	By facilityoption = By.xpath("//select[@name='facility']");
	By checkboxoption = By.xpath("//input[@name='hospital_readmission']");
	By radiobutton = By.xpath("(//label[@class='radio-inline'])[2]");
	By datefield = By.xpath("//input[@placeholder='dd/mm/yyyy']");
	By textfield = By.xpath("//textarea[@placeholder='Comment']");
	By bookoption = By.xpath("//*[text()='Book Appointment']");
	
	public Appointment_Page (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void Facility (String facilityselection) {
		WebElement facilitydropdown = driver.findElement(facilityoption);
		Select facilityobject = new Select(facilitydropdown);
		facilityobject.selectByVisibleText(facilityselection);
	}
	
	public void ReadmissionCheckBox() {
		driver.findElement(checkboxoption).click();
	}
	
	public void HealthcareProgram() {
		driver.findElement(radiobutton).click();
	}
	
	public void VisitDate (String date) {
		driver.findElement(datefield).sendKeys(date);
	}
	
	public void Comments (String textarea) {
		driver.findElement(textfield).sendKeys(textarea);
	}
	
	public void BookAppointment() {
		driver.findElement(bookoption).click();
	}
}
