 package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	
	//creations des constructeurs 
	public LoginPage(WebDriver driver) {
	this.driver =driver;
	PageFactory.initElements(driver, this);	
	}
	
	//identifications des elements(design pattern)
	
   @FindBy(how=How.ID,using="user-name")
	public WebElement username;
   
   @FindBy(how=How.ID,using="password")
   public WebElement password;
   
   @FindBy(how=How.ID,using="login-button")
   public WebElement login_bt;
   
   
   //creation des methode 
   public void get_url(String Url) {
	      driver.get(Url);
   }
   
   public void enterUsrname(String Username) {
	      username.sendKeys(Username);
   }
   
   public void enterPassword(String Password) {
		  password.sendKeys(Password);
	   }
   public void click_login_bt() {
		  login_bt.click();
	   }
   
   public  String CurrentURL() {
	   String url_obtenu=driver.getCurrentUrl();
	   return url_obtenu;
   }

}



