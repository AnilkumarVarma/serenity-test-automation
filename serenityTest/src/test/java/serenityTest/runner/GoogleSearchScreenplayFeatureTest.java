package serenityTest.runner;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

//@RunWith(SerenityRunner.class)
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
)
public class GoogleSearchScreenplayFeatureTest {

	

	    
	/*
	 * @Managed(driver = "chrome") private WebDriver browser;
	 * 
	 * private Actor james = Actor.named("james");
	 * 
	 * @Before public void setup() { james.can(BrowseTheWeb.with(browser)); }
	 */
	/*
	 * @Test public void whenGoogleSearchSerenityThenShouldSeeBDD() {
	 * givenThat(kitty).wasAbleTo(StartWith.googleSearchPage());
	 * 
	 * when(kitty).attemptsTo(SearchForKeyword.of("Serenity BDD"));
	 * 
	 * then(kitty).should(seeThat(GoogleSearchResults.displayed(),
	 * hasItem(containsString("Introduction to BDD Test Automation")))); }
	 */

}