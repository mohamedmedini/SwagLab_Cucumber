package StepDefinition;

import org.openqa.selenium.WebDriver;

import Hooks.SetUp;
import PageObject.ProductPage;
import io.cucumber.java.en.*;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Product_StepDef {
	
	WebDriver driver=SetUp.driver;
	ProductPage prod=new ProductPage (driver);

	
	@Given("Choose the first product and click add_to_cart1")
	public void choose_the_first_product_and_click_add_to_cart1() throws InterruptedException {
		prod.choose_prod1();
		prod.click_add1();
		
		Thread.sleep(2000);
	}

	@When("Choose the seecond product and click add_to_cart2")
	public void choose_the_seecond_product_and_click_add_to_cart2() throws InterruptedException {
	    prod.choose_prod2();
	    prod.click_add2();
	    
	    Thread.sleep(2000);
	}


	
	@When("click the cart button")
	public void click_the_cart_button() {
	    prod.click_cart();
	}

	@Then("verify that the two product are added successfully to my cart {string} and {string}")
	public void verify_that_the_three_product_are_added_successfully_to_my_cart_and(String string, String string2) throws InterruptedException {
	     
		Assert.assertEquals(string, prod.prod1_added());
		System.out.println("product 1 are added successfully");
		Assert.assertEquals(string2, prod.prod2_added());
		System.out.println("product 2 are added successfully");
		
		
		Thread.sleep(5000);
		
	}

}
