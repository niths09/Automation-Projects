package github_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {

	public WebDriver driver;
	
	By address = By.xpath("(//a[@href='https://tutorialsninja.com/demo/index.php?route=account/address'])[2]");
	By newaddress = By.xpath("//*[text()='New Address']");
	By firstname = By.xpath("//input[@name='firstname']");
	By lastname = By.xpath("//input[@name='lastname']");
	By company = By.xpath("//input[@name='company']");
	By address1 = By.xpath("//input[@name='address_1']");
	By address2 = By.xpath("//input[@name='address_2']");
	By city = By.xpath("//input[@name='city']");
	By postcode = By.xpath("//input[@name='postcode']");
	By country = By.xpath("//select[@name='country_id']");
	By state = By.xpath("//select[@name='zone_id']");
	By defaultaddress = By.xpath("(//input[@type='radio'])[1]");
	By submitbutton = By.xpath("//input[@value='Continue']");
	
	public AddressPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Timer() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	public void AddressBook() {
		driver.findElement(address).click();
	}
	
	public void NewAddress() {
		driver.findElement(newaddress).click();
	}
	
	public void FirstName (String fname) {
		driver.findElement(firstname).sendKeys(fname);
	}
	
	public void LastName (String lname) {
		driver.findElement(lastname).sendKeys(lname);
	}
	
	public void CompanyName (String companyname) {
		driver.findElement(company).sendKeys(companyname);
	}
	
	public void AddressOne (String addressone) {
		driver.findElement(address1).sendKeys(addressone);
	}
	
	public void AddressTwo (String addresstwo) {
		driver.findElement(address2).sendKeys(addresstwo);
	}
	
	public void City (String cityname) {
		driver.findElement(city).sendKeys(cityname);
	}
	
	public void Zipcode (String pincode) {
		driver.findElement(postcode).sendKeys(pincode);
	}
	
	public void CountrySelection (String region) {
		WebElement countrydropdown = driver.findElement(country);
		Select countryobject = new Select(countrydropdown);
		countryobject.selectByVisibleText(region);
	}
	
	public void District (String statename) {
		WebElement statedropdown = driver.findElement(state);
		Select stateobject = new Select(statedropdown);
		stateobject.selectByVisibleText(statename);
	}
	
	public void DefaultAddress() {
		driver.findElement(defaultaddress).click();
	}
	
	public void Continue() {
		driver.findElement(submitbutton).click();
	}
}
