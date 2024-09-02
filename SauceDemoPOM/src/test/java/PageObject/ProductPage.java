package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
    WebDriver driver;
	
	//creations des constructeur
	public ProductPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	//identifications des elemnts 
	@FindBy(how=How.XPATH,using="//img[@class='inventory_item_img']")
	public static List<WebElement>product;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn_primary btn_small btn_inventory ']")
	public static List<WebElement> add_bt;
	
	@FindBy(how=How.XPATH,using="//a[@class='shopping_cart_link']")
	public static WebElement cart_bt;
	
	@FindBy(how=How.XPATH,using="//div[normalize-space()='Sauce Labs Backpack']")
	WebElement prod1;
	
	@FindBy(how=How.XPATH,using="//div[normalize-space()='Sauce Labs Onesie']")
	WebElement prod2;
	
	
	
	
	
	//creations des methodes
	
	public void choose_prod1() {
		Actions action= new Actions (driver);
		action.moveToElement(product.get(0)).perform();
	}
	
	public void choose_prod2() {
		Actions action= new Actions (driver);
		action.moveToElement(product.get(3)).perform();
	}
	
	
	
	public void click_add1() {
		add_bt.get(0).click();
	}
	public void click_add2() {
		add_bt.get(3).click();
	}
	
	public void click_cart() {
		cart_bt.click();
	}
	
	public String prod1_added() {
		   String prod1_ob=prod1.getText();
		   return prod1_ob;
	}
	
	public String prod2_added() {
		   String prod2_ob=prod2.getText();
		   return prod2_ob;
	}
	
	

}
