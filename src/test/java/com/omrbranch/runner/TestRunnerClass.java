package com.omrbranch.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import com.omrbranch.report.Reporting;
import com.omrbranch.utility.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "com.omrbranch.stepdefinition",
        tags = "@Login",
        dryRun = false,
        monochrome = true,
        publish = true,
        stepNotifications = true,
        snippets = SnippetType.CAMELCASE,
        plugin = {
                "pretty",
                "json:target/output.json"
        })
public class TestRunnerClass {

//	@AfterClass
//	  public static void afterClass() throws FileNotFoundException, IOException {
//
//	    Reporting.generateJvmReport(getProjectPath() + "//target//output.json");
//	  }
}