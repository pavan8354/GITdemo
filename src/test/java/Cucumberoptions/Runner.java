package Cucumberoptions;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;		

//@RunWith(Cucumber.class)				
@CucumberOptions(features="C:/Users/Dell/eclipse-workspace/E2Eproject/src/test/java/features",glue="StepPdefinitions")						
public class Runner extends AbstractTestNGCucumberTests				
{		

}