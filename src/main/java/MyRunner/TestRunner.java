package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\Govind\\SeleniumWorkspace\\Naveen_FreeCrmDD_Framework_May2021\\src\\main\\java\\Features\\tagging.feature",
		glue= {"stepDefinitions"},
		format= {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-output/cucumber.xml"}, // to generate different type of report
		monochrome=true,    //  display the console output in a proper readable format
		strict=true,        // it will check if any step is not define in step definition file
		dryRun=false,       //  to check the mapping is proper between feature file and step definition file
		tags= {"~@SmokeTest" , "~@RegressionTest","~@End2End"}
		)
public class TestRunner {

}


// always run runner class is with dryrun=true ..it will check steps in the feature file map with methods in the stepdefinition file
// examples keyword is applicable for the entire testcases.
// but data table is applicable for perticular testcase where we use datatable.

// OR : tags= {"@SmokeTest , @RegressionTest"}  ----execute all test tagged as @SmokeTest OR @RegressionTest
//AND : tags= {"@SmokeTest" , "@RegressionTest"} ----execute all test tagged as @SmokeTest AND @RegressionTest
 // ~ : ignore Test scenarios (TestCases)