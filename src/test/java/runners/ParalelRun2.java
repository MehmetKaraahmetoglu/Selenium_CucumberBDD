package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"},
        features = "src/test/resources/features", // featureslarin oldugu klasörün yolunu verdik
        glue = "stepdefinitions", //stepdefinitions ile birbirine bagladik (path from content root ile hata verebiliyor
        tags ="@amazon",// calistirilacak taglar
        dryRun = false
)
public class ParalelRun2 {
}
