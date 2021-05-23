package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {

	public ContactUsPage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	
}
