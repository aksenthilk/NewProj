package com.sen.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\main\\java\\com\\sen\\features\\FreeCRM.feature",
                 glue = {".\\src\\main\\java\\com\\sen\\steps"},
                 dryRun = true,
                 monochrome = true,
                 format={"pretty","html:test-output","json:json-output/cucumber.json","junit:junit-output/cucumber.xml"}
                , strict = true		 
                		 )
//"cucumber.api.PendingException:TODO:implement me"  exception is thrown when strict=true and if any steps are unimplemented
                 
public class RunTest {

}