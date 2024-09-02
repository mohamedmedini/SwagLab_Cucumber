package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	
	WebDriver driver;
	
	//creations des cobstructeurs
	public PaymentPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	//identification des elements
	
	@FindBy(how=How.XPATH,using="//button[@id='checkout']")
	public static WebElement checkout_bt;
	
	@FindBy(how=How.XPATH,using="//input[@id='continue']")
	public static WebElement continue_bt;
	
	@FindBy(how=How.XPATH,using="//button[@id='finish']")
	public static WebElement finish_bt;
	
	@FindBy(how=How.XPATH,using="//input[@id='first-name']")
	public static WebElement FirstName;
	
	@FindBy(how=How.XPATH,using="//input[@id='last-name']")
	public static WebElement LastName;
	
	@FindBy(how=How.XPATH,using="//input[@id='postal-code']")
	public static WebElement ZipCode;
	
	@FindBy(how=How.XPATH,using="//h2[normalize-space()='Thank you for your order!']")
	WebElement Expected_message;
	
	
	
	
	
	//creation des methodes 
	
	public void click_Checkout() {
		checkout_bt.click();
	}
	
	public void enter_FirstName(String first_name) {
		FirstName.sendKeys(first_name);
	}
	public void enter_LasttName(String last_name) {
		LastName.sendKeys(last_name);
	}
	public void enter_ZipCode(String zip_code) {
		ZipCode.sendKeys(zip_code);
	}
	
	public void click_Continue() {
		continue_bt.click();
	}
	public void click_Finish() {
		finish_bt.click();
	}
	
	public String confirmation_message() {
		   String obtained_msg=Expected_message.getText();
		   return obtained_msg;	
	}
	

}
