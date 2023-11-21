package runner;


	import org.testng.annotations.DataProvider;
	 
	 
	import io.cucumber.testng.AbstractTestNGCucumberTests;
	import io.cucumber.testng.CucumberOptions;
	 
	@CucumberOptions(tags="",features={"C:\\Team2\\Praveen_pilot_project\\Venture_pilot_project\\src\\test\\resources\\Features\\Login.feature","C:\\Team2\\Praveen_pilot_project\\Venture_pilot_project\\src\\test\\resources\\Features\\Time.feature"}, glue="com.stepdefinition",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},dryRun=false)
	 
	public class TestRunners extends AbstractTestNGCucumberTests {
	@Override
	 
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	}


