package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Login_StepDef {
	
	WebDriver driver=SetUp.driver;
	LoginPage log=new LoginPage (driver);
    

	@Given("I enter  url {string}")
	public void i_enter_url(String string) {
	  log.get_url(string);
	}

	@When("I enter  username {string}")
	public void i_enter_username(String string) {
	  log.enterUsrname(string);
	}

	@When("I enter  password {string}")
	public void i_enter_password(String string) {
	    log.enterPassword(string);
	}

	@When("I click  login button")
	public void i_click_login_button() {
	    log.click_login_bt();
	}

	@SuppressWarnings("deprecation")
	@Then("I validate  page {string}")
	public void i_validate_page(String string) {
		Assert.assertEquals(string, log.CurrentURL());
		System.out.println("URL obtained succefully");
		  
	}


}
