package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import BasePage.BasePage;


public class RegistrationPage extends BasePage{
	
	public RegistrationPage(WebDriver driver) {
	    super(driver);
	    PageFactory.initElements(driver, this);
	  }
	
	 @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign in')]") 
	 private WebElement clk_signbtn;
	 
	 @FindBy(how = How.ID, using = "email_create") 
	 private WebElement enter_email;
	 
	 
	 @FindBy(how = How.ID, using = "SubmitCreate") 
	 private WebElement clk_CreateAccountbtn;
	 
	 public void ClickSignButton() {
		 clk_signbtn.click();
		 }
	 
	 public void EnterEmailAddress() {
		enter_email.sendKeys("sample@outlook.in");
		 }
	 
	 public void ClickCreateAccountButton() {
		 clk_CreateAccountbtn.click();
		 }
	 
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Create an account')]") 
	 private WebElement HeaderTxt;
	
	public void GetHeaderText() {
		String getHeaderName = HeaderTxt.getText();
		System.out.println(getHeaderName);
	}
}
