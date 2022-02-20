package com.cucumber.runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = { // report
				"html:target/report/cucumber.html", "json:target/cucumber.json"

		}, features = { "src/test/resources/OrbisLogin.feature" ,"src/test/resources/ScenarionOutlineLogin.feature"}, // path
		glue = { "com.cucumber.stepdef" },// stepdef package name
        tags = "@Regression",
		monochrome =true//easy to read console (remove all sign)

)
public class Runnerfile extends AbstractTestNGCucumberTests {

	@BeforeTest // hook
	public void setup() {
		// code
	}

	@Test // hook
	public void test() {
		// code
	}

	@AfterTest // hook
	public void teardown() {
		// code
	}

}
