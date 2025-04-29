package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class SetUp {

    public static WebDriver driver;

    @Before
    public void initial() {
        driver = DriverManager.GetDriver();
    }

    @BeforeStep
    public void beforeStep() {
        System.out.println("Step in progress...");
    }

    @AfterStep
    public void takeScreenshot(Scenario scenario) {
        if (driver instanceof TakesScreenshot) {
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", "screenshot");
            } catch (Exception e) {
                System.err.println("Failed to take screenshot: " + e.getMessage());
            }
        }
    }

    @After
    public void terminate() {
        if (driver != null) {
            try {
                driver.quit(); // Prefer quit() to close() to fully release the session
            } catch (Exception e) {
                System.err.println("Error while quitting the driver: " + e.getMessage());
            }
        }
    }
}
