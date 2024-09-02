package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.PaymentPage;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class PayPage_StepDef {
	
	WebDriver driver=SetUp.driver;
	PaymentPage pay=new PaymentPage (driver);
	
	
	@Given("i click the checkout button")
	public void i_click_the_checkout_button() {
	    pay.click_Checkout();
	}

	@When("i enter the First Name {string}")
	public void i_enter_the_first_name(String string) {
	    pay.enter_FirstName(string);
	}

	@When("i enter the Last Name  {string}")
	public void i_enter_the_last_name(String string) {
	    pay.enter_LasttName(string);
	}

	@When("i enter the Zip Code {string}")
	public void i_enter_the_zip_code(String string) {
	    pay.enter_ZipCode(string);
	}

	@When("i click the continue button")
	public void i_click_the_continue_button() {
	    pay.click_Continue();
	}

	@When("i click the finish button")
	public void i_click_the_finish_button() {
	   pay.click_Finish();
	}

	@SuppressWarnings("deprecation")
	@Then("i verify the payment with the message {string}")
	public void i_verify_the_payment_with_the_message(String string) {
	    Assert.assertEquals(string, pay.confirmation_message());
	    System.out.println("THE ORDER ARE PAYED SUCCESSFULLY");
	}

}
