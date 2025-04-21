package Hooks;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	
public static WebDriver driver;
	
	    public static WebDriver GetDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;	
		
	}
 
}

// input chrome options to run github actions 

//public static WebDriver driver;
//
//public static WebDriver GetDriver() {
//    if (driver == null) {
//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("--disable-gpu");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--remote-allow-origins=*");
//
//         Generate a unique user-data-dir for each test run
//        String uniqueUserDataDir = System.getProperty("java.io.tmpdir") + "/chrome-profile-" + System.nanoTime();
//        new File(uniqueUserDataDir).mkdirs();  // make sure it exists
//        options.addArguments("--user-data-dir=" + uniqueUserDataDir);
//
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    return driver;
//}
