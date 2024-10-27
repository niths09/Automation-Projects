package github_projects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SwagLabsPage {
	
	public WebDriver driver;
	public LoginPage loginpageobject;
	public HomePage homepageobject;
	public ProductPage productpageobject;
	public CartPage cartpageobject;
	public CheckOutPage checkoutpageobject;
	public LogoutPage logoutpageobject;
	
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  driver = new ChromeDriver();
	  loginpageobject = new LoginPage(driver);
	  homepageobject = new HomePage(driver);
	  productpageobject = new ProductPage(driver);
	  cartpageobject = new CartPage(driver);
	  checkoutpageobject = new CheckOutPage(driver);
	  logoutpageobject = new LogoutPage(driver);
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(2000);
  }	
	
  @Test (priority=1)
  public void loginMethod() throws InterruptedException {
	  loginpageobject.UserName("standard_user");
	  loginpageobject.Timer();
	  loginpageobject.PassWord("secret_sauce");
	  loginpageobject.Timer();
	  loginpageobject.Login();
	  loginpageobject.Timer();
  }
  
  @Test (priority=2)
  public void homeMethod() throws InterruptedException {
      JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
      js_scrolldown.executeScript("window.scrollBy(0,800)");
      homepageobject.Timer();
      // Store the original window handle
      String originalWindow = driver.getWindowHandle();
      homepageobject.TwitterLogo();
      switchToNewWindowAndClose(originalWindow);
      homepageobject.FacebookLogo();
      switchToNewWindowAndClose(originalWindow);
      homepageobject.LinkedinLogo();
      switchToNewWindowAndClose(originalWindow);
      JavascriptExecutor js_scrollup = (JavascriptExecutor) driver;
      js_scrollup.executeScript("window.scrollBy(0,-800)");
      homepageobject.Timer();
  }
  
  private void switchToNewWindowAndClose(String originalWindow) throws InterruptedException {
	  homepageobject.Timer();
	  // Loop through all open windows
	  for (String windowHandle : driver.getWindowHandles()) {
		  if (!windowHandle.equals(originalWindow)) {
			  driver.switchTo().window(windowHandle); // Switch to the new window
			  Thread.sleep(8000);
			  driver.close(); // Close the new window
			  driver.switchTo().window(originalWindow); // Switch back to the original window
			  break;
		  }
	  }
  }
  
  @Test (priority=3)
  public void productMethod() throws InterruptedException {
	  productpageobject.FilterOne("Name (Z to A)");
	  productpageobject.Timer();
	  productpageobject.ProductOne();
	  productpageobject.Timer();
	  productpageobject.AddItemOne();
	  productpageobject.Timer();
	  driver.navigate().back();
	  productpageobject.FilterTwo("Price (high to low)");
	  productpageobject.Timer();
	  productpageobject.AddItemTwo();
	  productpageobject.Timer();
	  JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
      js_scrolldown.executeScript("window.scrollBy(0,200)");
      productpageobject.Timer();
      productpageobject.AddItemThree();
      productpageobject.Timer();
      JavascriptExecutor js_scrollup = (JavascriptExecutor) driver;
      js_scrollup.executeScript("window.scrollBy(0,-200)");
      productpageobject.Timer();
  }
  
  @Test (priority=4)
  public void cartMethod() throws InterruptedException {
	  cartpageobject.CartIcon();
	  cartpageobject.Timer();
	  JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
      js_scrolldown.executeScript("window.scrollBy(0,400)");
      cartpageobject.Timer();
      cartpageobject.RemoveIcon();
      cartpageobject.Timer();
      cartpageobject.CheckOutIcon();
      cartpageobject.Timer();
  }

  @Test (priority=5)
  public void checkoutMethod() throws InterruptedException {
	  checkoutpageobject.FirstName("John");
	  checkoutpageobject.Timer();
	  checkoutpageobject.LastName("Smith");
	  checkoutpageobject.Timer();
	  checkoutpageobject.ZipCode("10163");
	  checkoutpageobject.Timer();
	  checkoutpageobject.Continue();
	  checkoutpageobject.Timer();
	  JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
      js_scrolldown.executeScript("window.scrollBy(0,400)");
      checkoutpageobject.Timer();
      checkoutpageobject.Finish();
      checkoutpageobject.Timer();
      checkoutpageobject.Back();
      checkoutpageobject.Timer();
  }
  
  @Test (priority=6)
  public void logoutMethod() throws InterruptedException {
	  JavascriptExecutor js_scrollup = (JavascriptExecutor) driver;
      js_scrollup.executeScript("window.scrollBy(0,-200)");
      logoutpageobject.Timer();
	  logoutpageobject.Navigation();
	  logoutpageobject.Timer();
	  logoutpageobject.Logout();
	  logoutpageobject.Timer();
  }
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
