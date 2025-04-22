package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
	tags= "@Payement_SauceDemo" ,
	features= "src/test/features/PaymentPage/Payement.feature",
	glue={"Hooks","StepDefinition"},
	
	
	publish= true,
    plugin ={"pretty","html:target/htmlreport.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","json:target/report","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
    
			
public class Runner {

}
