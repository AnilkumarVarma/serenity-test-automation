package serenityTest.runner.steps;

import static java.util.Arrays.stream;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import serenityTest.screenplay.questions.GoogleSearchResults;
import serenityTest.screenplay.task.SearchForKeyword;
import serenityTest.screenplay.task.StartWith;

public class SearchSteps {

	@ParameterType(".*")
	public List<String> tasks(String value) {
		return stream(value.split(",")).map(String::trim).collect(Collectors.toList());
	}

	@ParameterType(".*")
	public Actor actor(String actorName) {
		return theActorCalled(actorName);
	}

	@Managed(driver = "chrome")
	private WebDriver browser;

	@Before
	public void set_the_stage() {
		OnStage.setTheStage(new OnlineCast());

		OnStage.aNewActor().can(BrowseTheWeb.with(browser));
	}

	@Given("that {string} start google search")
	public void james_start_google_search(String string) {
		// Write code here that turns the phrase above into concrete actions
		OnStage.theActorCalled(string).wasAbleTo(StartWith.googleSearchPage());
		// theActor.wasAbleTo(StartWith.googleSearchPage());

	}

	@When("he search for {string}")
	public void he_search_for(String string) {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().attemptsTo(SearchForKeyword.of(string));
	}

	@Then("google search results should be a collection containing a string containing {string}")
	public void google_search_results_should_be_a_collection_containing_a_string_containing(String string) {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().should(seeThat(GoogleSearchResults.displayed(), hasItem(containsString(string))));

	}
}
