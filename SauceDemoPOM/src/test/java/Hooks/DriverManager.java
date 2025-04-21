package Hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
public static WebDriver driver;
	
	public static WebDriver GetDriver() {
		WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		
		ChromeOptions options = new ChromeOptions();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		options.addArguments("--headless"); // pour GitHub Actions
		options.addArguments("--disable-gpu");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-allow-origins=*");
		// Supprime cette ligne si elle existe
		// options.addArguments("--user-data-dir=/some/path");

		driver = new ChromeDriver(options);

		return driver;	
	}
	

}
