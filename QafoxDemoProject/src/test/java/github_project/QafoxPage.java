package github_project;

import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class QafoxPage {
	
	public WebDriver driver;
	public AccountPage accountpageobject;
	public AddressPage addresspageobject;
	public SearchPage searchpageobject;
	public ProductPageOne productpageoneobject;
	public HeaderPage headerpageobject;
	public ProductPageTwo productpagetwoobject;
	public ProductPageThree productpagethreeobject;
	public WishlistPage wishlistobject;
	public ComparisonPage comparisonpageobject;
	public CartPage cartpageobject;
	public CheckoutPage checkoutpageobject;
	
  @BeforeClass
  public void beforeMethod() throws InterruptedException {
	driver = new ChromeDriver();
    accountpageobject = new AccountPage(driver); 
	addresspageobject = new AddressPage(driver);
	searchpageobject = new SearchPage(driver);
	productpageoneobject = new ProductPageOne(driver);
	headerpageobject = new HeaderPage(driver);
	productpagetwoobject = new ProductPageTwo(driver);
	productpagethreeobject = new ProductPageThree(driver);
	wishlistobject = new WishlistPage(driver);
	comparisonpageobject = new ComparisonPage(driver);
	checkoutpageobject = new CheckoutPage(driver);
	cartpageobject = new CartPage(driver);
	driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
  }
  
  @Test (priority = 0)
  public void accountMethod() throws InterruptedException {
	  accountpageobject.AccountSelection();
	  accountpageobject.Timer();
	  accountpageobject.EMailAddress("johndoe2000@gmail.com");
	  accountpageobject.Timer();
	  accountpageobject.Password("12345");
	  accountpageobject.Timer();
	  accountpageobject.Login();
	  accountpageobject.Timer();
	  accountpageobject.CurrencySelection();
	  accountpageobject.Timer();
  }
  
  @Test (priority = 1)
  public void addressMethod() throws InterruptedException {
	  addresspageobject.AddressBook();
	  addresspageobject.Timer();
	  addresspageobject.NewAddress();
	  addresspageobject.Timer();
	  addresspageobject.FirstName("John");
	  addresspageobject.Timer();
	  addresspageobject.LastName("Doe");
	  addresspageobject.Timer();
	  addresspageobject.CompanyName("ABC Company");
	  addresspageobject.Timer();
	  addresspageobject.AddressOne("123 Kangaroo Street");
	  addresspageobject.Timer();
	  addresspageobject.AddressTwo("Suite 4B");
	  addresspageobject.Timer();
	  JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
	  js_scrolldown.executeScript("window.scrollBy(0,200)");
	  addresspageobject.Timer();
	  addresspageobject.City("Sydney");
	  addresspageobject.Timer();
	  addresspageobject.Zipcode("10003");
	  addresspageobject.Timer();
	  addresspageobject.CountrySelection("Australia");
	  addresspageobject.Timer();
	  addresspageobject.District("New South Wales");
	  addresspageobject.Timer();
	  addresspageobject.DefaultAddress();
	  addresspageobject.Timer();
	  addresspageobject.Continue();
	  addresspageobject.Timer();
  }
  
  @Test (priority = 2)
  public void searchMethod() throws InterruptedException {
	  searchpageobject.Heading();
	  searchpageobject.Timer();
	  searchpageobject.SearchField("iPhone");
	  searchpageobject.Timer();
	  searchpageobject.SearchIcon();
	  searchpageobject.Timer();
  }
  
  @Test (priority = 3)
  public void productpageoneMethod() throws InterruptedException {
	  JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
	  js_scrolldown.executeScript("window.scrollBy(0,200)");
	  productpageoneobject.Timer();
	  productpageoneobject.MobileProduct();
	  productpageoneobject.Timer();
	  productpageoneobject.IphoneImage();
	  productpageoneobject.Timer();
	  for (int i = 0; i < 5; i++) {
		  productpageoneobject.RightButton();
		  productpageoneobject.Timer();
	  }
	  for (int i = 0; i < 5; i++) {
		  productpageoneobject.LeftButton();
		  productpageoneobject.Timer();
	  }
	  productpageoneobject.CrossButton();
	  productpageoneobject.Timer();
	  productpageoneobject.ClearQuantityField();
	  productpageoneobject.Timer();
	  productpageoneobject.QuantityField("2");
	  productpageoneobject.Timer();
	  productpageoneobject.AddToCart();
	  productpageoneobject.Timer();
  }
  
  @Test (priority = 4)
  public void headerMethod() throws InterruptedException {
	  headerpageobject.TitleName();
	  headerpageobject.Timer();
	  headerpageobject.ComponentsMenuBar();
	  headerpageobject.Timer();
	  headerpageobject.MonitorsDropDown();
	  headerpageobject.Timer();
  }
  
  @Test (priority = 5)
  public void productpagetwoMethod() throws InterruptedException {
	  JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
	  js_scrolldown.executeScript("window.scrollBy(0,200)");
	  productpagetwoobject.Timer();
	  productpagetwoobject.SamsungMonitorProduct();
	  productpagetwoobject.Timer();
	  productpagetwoobject.ClearQuantityField();
	  productpagetwoobject.Timer();
	  productpagetwoobject.QuantityField("2");
	  productpagetwoobject.Timer();
	  productpagetwoobject.CartButton();
	  productpagetwoobject.Timer();
  }
  
  @Test (priority = 6)
  public void productpagethreeMethod() throws InterruptedException {
	  productpagethreeobject.Heading();
	  productpagethreeobject.Timer();
	  productpagethreeobject.LaptopsAndNotebooks();
	  productpagethreeobject.Timer();
	  productpagethreeobject.LaptopsDropDown();
	  productpagethreeobject.Timer();
	  JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
	  js_scrolldown.executeScript("window.scrollBy(0,400)");
	  productpagethreeobject.Timer();
	  productpagethreeobject.ProductClick();
	  productpagethreeobject.Timer();
	  productpagethreeobject.ClearDeliveryDate();
	  productpagethreeobject.Timer();
	  productpagethreeobject.DeliveryDate("2024-10-28");
	  productpagethreeobject.Timer();
	  productpagethreeobject.ClearQuantity();
	  productpagethreeobject.Timer();
	  productpagethreeobject.AddQuantity("2");
	  productpagethreeobject.Timer();
	  productpagethreeobject.CartButton();
	  productpagethreeobject.Timer();
  }
  
  @Test (priority = 7)
  public void wishlistMethod() throws InterruptedException {
	  wishlistobject.HeadingName();
	  wishlistobject.Timer();
	  wishlistobject.CameraMenu();
	  wishlistobject.Timer();
	  wishlistobject.CameraClick();
	  wishlistobject.Timer();
	  wishlistobject.WishlistOne();
	  wishlistobject.Timer();
	  wishlistobject.HeadingName();
	  wishlistobject.Timer();
	  wishlistobject.AllLaptopsNotebooks();
	  wishlistobject.Timer();
	  wishlistobject.ShowDropDown();
	  wishlistobject.Timer();
	  JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
	  js_scrolldown.executeScript("window.scrollBy(0,800)");
	  wishlistobject.Timer();
	  wishlistobject.LaptopSelection();
	  wishlistobject.Timer();
	  wishlistobject.WishlistTwo();
	  wishlistobject.Timer();
	  wishlistobject.AddToWishList();
	  wishlistobject.Timer();
	  wishlistobject.RemoveButton();
	  wishlistobject.Timer();
	  wishlistobject.ContinueButton();
	  wishlistobject.Timer();
  }
  
  @Test (priority = 8)
  public void comparisonMethod() throws InterruptedException {
	  comparisonpageobject.HeadingName();
	  comparisonpageobject.Timer();
	  comparisonpageobject.PhoneSelection();
	  comparisonpageobject.Timer();
	  comparisonpageobject.PhoneImageOne();
	  comparisonpageobject.Timer();
	  comparisonpageobject.ComparisonButton();
	  comparisonpageobject.Timer();
	  driver.navigate().back();
	  comparisonpageobject.Timer();
	  comparisonpageobject.PhoneImageTwo();
	  comparisonpageobject.Timer();
	  comparisonpageobject.ComparisonButton();
	  comparisonpageobject.Timer();
	  comparisonpageobject.ComparisonLink();
	  comparisonpageobject.Timer();
	  JavascriptExecutor js_scrolldown = (JavascriptExecutor) driver;
	  js_scrolldown.executeScript("window.scrollBy(0,400)");
	  comparisonpageobject.Timer();
	  comparisonpageobject.AddToCart();
	  comparisonpageobject.Timer();
	  comparisonpageobject.RemoveButton();
	  comparisonpageobject.Timer();
	  comparisonpageobject.RemoveItem();
	  comparisonpageobject.Timer();
	  JavascriptExecutor js_scrollup = (JavascriptExecutor) driver;
	  js_scrollup.executeScript("window.scrollBy(0,-400)");
	  comparisonpageobject.Timer();
	  comparisonpageobject.Continue();
	  comparisonpageobject.Timer();
  }
  
  @Test (priority = 9)
  public void addtocartMethod() throws InterruptedException {
	  cartpageobject.AddToCart();
	  cartpageobject.Timer();
	  cartpageobject.RemoveButtonOne();
	  cartpageobject.Timer();
	  cartpageobject.RemoveButtonTwo();
	  cartpageobject.Timer();
	  cartpageobject.RemoveButtonThree();
	  cartpageobject.Timer();
	  cartpageobject.ClearQuantity();
	  cartpageobject.Timer();
	  cartpageobject.AddQuantity("4");
	  cartpageobject.Timer();
	  cartpageobject.RefreshQuantity();
	  cartpageobject.Timer();
	  JavascriptExecutor js_scrolldownone = (JavascriptExecutor) driver;
	  js_scrolldownone.executeScript("window.scrollBy(0,400)");
	  cartpageobject.Timer();
	  cartpageobject.ShippingToggle();
	  cartpageobject.Timer();
	  cartpageobject.GetQuotes();
	  cartpageobject.Timer();
	  cartpageobject.QuoteRadio();
	  cartpageobject.Timer();
	  cartpageobject.ApplyShipping();
	  cartpageobject.Timer();
	  JavascriptExecutor js_scrolldowntwo = (JavascriptExecutor) driver;
	  js_scrolldowntwo.executeScript("window.scrollBy(0,400)");
	  cartpageobject.Timer();
	  cartpageobject.CheckOut();
	  cartpageobject.Timer();
  }
  
  @Test (priority = 10)
  public void checkoutMethod() throws InterruptedException {
	  checkoutpageobject.BillingContinue();
	  checkoutpageobject.Timer();
	  checkoutpageobject.DeliveryDetailsContinue();
	  checkoutpageobject.Timer();
	  JavascriptExecutor js_scrolldownone = (JavascriptExecutor) driver;
	  js_scrolldownone.executeScript("window.scrollBy(0,200)");
	  checkoutpageobject.Timer();
	  checkoutpageobject.CommentFieldOne("Handle with care. Thanks!");
	  checkoutpageobject.Timer();
	  JavascriptExecutor js_scrolldowntwo = (JavascriptExecutor) driver;
	  js_scrolldowntwo.executeScript("window.scrollBy(0,200)");
	  checkoutpageobject.Timer();
	  checkoutpageobject.DeliveryMethodContinue();
	  checkoutpageobject.Timer();
	  JavascriptExecutor js_scrolldownthree = (JavascriptExecutor) driver;
	  js_scrolldownthree.executeScript("window.scrollBy(0,200)");
	  checkoutpageobject.Timer();
	  checkoutpageobject.CheckBox();
	  checkoutpageobject.Timer();
	  JavascriptExecutor js_scrolldownfour = (JavascriptExecutor) driver;
	  js_scrolldownfour.executeScript("window.scrollBy(0,200)");
	  checkoutpageobject.Timer();
	  checkoutpageobject.PaymentContinue();
	  checkoutpageobject.Timer();
	  checkoutpageobject.ConfirmOrder();
	  checkoutpageobject.Timer();
	  checkoutpageobject.Proceed();
	  checkoutpageobject.Timer();
  }
  
  @AfterClass
  public void afterMethod() {
	 driver.close();
  }
}
