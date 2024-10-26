package github_project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CuraHealthcare_Page {
	
	public WebDriver driver;
	public Login_Page loginpage_object;
	public Appointment_Page appointmentpage_object;
	public Confirmation_Page confirmationpage_object;
	public History_Page historypage_object;
	public Logout_Page logoutpage_object;
	
  @BeforeClass
  public void beforeClass() throws InterruptedException {
    driver = new ChromeDriver();
	loginpage_object = new Login_Page(driver);
	appointmentpage_object = new Appointment_Page(driver);
	confirmationpage_object = new Confirmation_Page(driver);
	historypage_object = new History_Page(driver);
	logoutpage_object = new Logout_Page(driver);	
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	Thread.sleep(2000);
  }
	
  @Test (priority = 0)
  public void loginpageMethod() throws InterruptedException {
	  loginpage_object.Navigation();
	  loginpage_object.Timer();
	  loginpage_object.SignIn();
	  loginpage_object.Timer();
	  loginpage_object.Username("John Doe");
	  loginpage_object.Timer();
	  loginpage_object.Password("ThisIsNotAPassword");
	  loginpage_object.Timer();
	  loginpage_object.Login();
	  loginpage_object.Timer();
  }
  
  @Test (priority = 1)
  public void makeappointmentpageMethod() throws InterruptedException {
	  appointmentpage_object.Timer();
	  appointmentpage_object.Facility("Hongkong CURA Healthcare Center");
	  appointmentpage_object.Timer();
	  appointmentpage_object.ReadmissionCheckBox();
	  appointmentpage_object.Timer();
	  appointmentpage_object.HealthcareProgram();
	  appointmentpage_object.Timer();
	  appointmentpage_object.VisitDate("10/11/2024");
	  appointmentpage_object.Timer();
	  appointmentpage_object.Comments("Requesting an appointment for follow-up care under Medicaid on 10/11/2024. Applying for hospital readmission as needed. Thank you.");
	  appointmentpage_object.Timer();
	  appointmentpage_object.BookAppointment();
	  appointmentpage_object.Timer();
  }
  
  @Test (priority = 2)
  public void confirmationpageMethod() throws InterruptedException {
	  confirmationpage_object.Homepage();
	  confirmationpage_object.Timer();
  }
  
  @Test (priority = 3)
  public void historypageMethod() throws InterruptedException {
	  historypage_object.Navigation();
	  historypage_object.Timer();
	  historypage_object.History();
	  historypage_object.Timer();
	  historypage_object.HomePageButton();
	  historypage_object.Timer();
  }
  
  @Test (priority = 4)
  public void logoutpageMethod() throws InterruptedException {
	  logoutpage_object.Navigation();
	  logoutpage_object.Timer();
	  logoutpage_object.LogOut();
	  logoutpage_object.Timer();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
}
