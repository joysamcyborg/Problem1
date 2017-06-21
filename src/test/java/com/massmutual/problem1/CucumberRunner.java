package com.massmutual.problem1;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author JoyB
 *
 */
@RunWith(Cucumber.class)

@CucumberOptions( 
		   plugin = {"html:target/cucumber-html-report", "json:target/Test-report/cucumber.json",
                   "pretty:target/Test-report/cucumber-pretty.txt", "usage:target/Test-report/cucumber-usage.json",
                   "junit:target/Test-report/cucumber-results.xml"},
		   features = {"src/test/resources/",}
		   ) 
public class CucumberRunner {

}