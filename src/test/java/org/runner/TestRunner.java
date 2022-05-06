package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.mainclass",dryRun=false,
monochrome=true,
snippets=SnippetType.UNDERSCORE,
plugin= {"pretty",
		"json:src\\test\\resources\\jvmreport.json"}
)
public class TestRunner {
	@AfterClass

	public static void report() {

		
		JVMReport.generateJVMReport("src\\test\\resources\\jvmreport.json");
	System.out.println("=====done====");
	}
}
