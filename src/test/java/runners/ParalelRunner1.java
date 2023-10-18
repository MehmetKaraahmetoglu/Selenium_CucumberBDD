package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//"mvn clean verify" i terminale yazarak paralel calistirmayi baslatiriz

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"},
        features = "src/test/resources/features", // featureslarin oldugu klasörün yolunu verdik
        glue = "stepdefinitions", //stepdefinitions ile birbirine bagladik (path from content root ile hata verebiliyor
        tags ="@smoke",// calistirilacak taglar
        dryRun = false
)

public class ParalelRunner1 {

}
