package runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin={"html:target/cucumber-html-reports1/cucumber.html", // buradaki / \\ idi, degistirdim, emin degilim
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"}, // bu satir ile html,xml,json report olusturabiliyoruz
        features = "src/test/resources/features",
        glue = {"stepdefinitions" , "hooks"},
        tags = "@paralel1",
        dryRun = false

        // step definition olusturmak icin calistirdiginda burayı true yapmayi unutma
)


public class ParalelTestrunner1 {

}
