package com.cbt.runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format={"html:target/cucumber-report/registration",
		"json:target/cucumber-report/registration/cucumber.json"},	
		features = "./src/test/resources/features/regisration",
		glue= "com/cbt/stepdefs"
		)

public class RegisrationRunner {

}
