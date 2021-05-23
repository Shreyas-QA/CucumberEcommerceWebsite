package StepsDefinations;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.RegistrationPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.Internal.IntList;

public class Steps {

	public static WebDriver driver;
	RegistrationPage rpage = null;
	
	@Given("^User is on Home Page$")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://automationpractice.com/index.php");
	}
	
	@Then("^Click on Sign In Page$")
	public void click_on_sign_in_page() {
	    
		rpage = new RegistrationPage(driver);
		rpage.ClickSignButton();
			
		}
	
	@And("^Enter Valid EmailId under Create Account$")
	public void enter_valid_email_id_under_create_account() {
		rpage = new RegistrationPage(driver);
	    rpage.EnterEmailAddress();
	}
	
	@Then("^Click Enter$")
	public void click_enter() {
		rpage = new RegistrationPage(driver);
		  rpage.ClickCreateAccountButton();
	}

	@Given("^I am on the new user registration page$")
	public void NewRegistrationPage() throws InterruptedException

	{
		
		rpage = new RegistrationPage(driver);
		rpage.GetHeaderText();
		
	}
	
	@When("^I enter valid data on the page$")
	public void EnterDetails(DataTable table) {
		
		
	}

}
