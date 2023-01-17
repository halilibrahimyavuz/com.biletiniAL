package runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin={"html:target/cucumber-html-reports2/cucumber.html", // buradaki / \\ idi, degistirdim, emin degilim
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"}, // bu satir ile html,xml,json report olusturabiliyoruz
        features = "src/test/resources/features",
        glue = {"stepdefinitions" , "hooks"},
        tags = "@paralel2",
        dryRun = false

        // step definition olusturmak icin calistirdiginda burayı true yapmayi unutma
)

public class ParalelTestrunner2
{
}
