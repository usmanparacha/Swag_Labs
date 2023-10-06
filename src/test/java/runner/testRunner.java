package runner;


import Assets.Listener;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@Listeners({Listener.class})

@CucumberOptions(
        features = "src/test/resources",
        glue = "stepDefinitions",
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        })
public class testRunner extends AbstractTestNGCucumberTests {
}
