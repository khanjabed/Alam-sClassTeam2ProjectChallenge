package com.usa.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "Features"},
     glue = {"com.usa.ylstepdefition"},
     dryRun = false,
     monochrome=true,
     strict=false,
plugin= {"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json" }

)

public class YLRunner extends AbstractTestNGCucumberTests {

}
