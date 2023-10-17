package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.GooglePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepdefinitions {

    GooglePage googlePage = new GooglePage();

    @Then("google da {string} icin arama yapar")
    public void google_da_icin_arama_yapar(String istenenKelime) {
        googlePage.googleSearchBox.click();
        googlePage.googleSearchBox.sendKeys(istenenKelime + Keys.ENTER);
    }

    @Then("google arama sonuclarinin {string} icerdigini test eder")
    public void google_arama_sonuclarinin_icerdigini_test_eder(String istenenKelime) {

        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(istenenKelime));
    }

    @And("cookies kabul eder")
    public void cookiesKabulEder() {

       //JavascriptExecutor jse= (JavascriptExecutor) Driver.getDriver();
       //jse.executeScript("arguments[0].scrollIntoView(true);",googlePage.cookiesKabulButonu);
       //ReusableMethods.bekle(1);
        googlePage.cookiesKabulButonu.click();
    }
}
