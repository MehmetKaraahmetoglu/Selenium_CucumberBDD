package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features", // featureslarin oldugu klasörün yolunu verdik
        glue = "stepdefinitions", //stepdefinitions ile birbirine bagladik (path from content root ile hata verebiliyor
        tags ="@wip",// calistirilacak taglar
        dryRun = false


)

public class Runner {

/*
    Runner class'i bos bir class'dir.

    bu classda asil isi

    Class'da kullandigimiz 2 notasyon yapar.


    dryRun = true secildiginde
    Runner istenen feature/scenerio'yu calistirmaya degil
    eksik adimlarini bulmaya odaklanir
    Not: @wip ( work in progress)

    EGER eksik adim yoksa test PASSED der.
    ama bu testin calisip, tüm adimlari gectigini gostermez
    SADECE eksik adim olmadigini gösterir.

    EGER eksik adim bulma amacimiz yoksa
    testlerimizi normal olarak CALISTIRMAK istiyorsak
    dryRun = false secilmalidir

 */



}
//echo "# Selenium_CucumberBDD" >> README.md
//        git init
//        git add README.md
//        git commit -m "first commit"
//        git branch -M main
//        git remote add origin https://github.com/MehmetKaraahmetoglu/Selenium_CucumberBDD.git
//        git push -u origin main