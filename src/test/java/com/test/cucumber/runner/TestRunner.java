package com.test.cucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\test\\cucumber\\features\\login.feature", 
				 glue = "com.test.cucumber.stepdefinitions",
				 dryRun = false)

public class TestRunner {

}
