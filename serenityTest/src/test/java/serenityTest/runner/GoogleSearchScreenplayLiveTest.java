package serenityTest.runner;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import serenityTest.screenplay.questions.GoogleSearchResults;
import serenityTest.screenplay.task.SearchForKeyword;
import serenityTest.screenplay.task.StartWith;


//@RunWith(SerenityRunner.class)

public class GoogleSearchScreenplayLiveTest {

    @Managed(driver = "chrome")
    private WebDriver browser;

    private Actor kitty = Actor.named("kitty");

    @Before
    public void setup() {
        kitty.can(BrowseTheWeb.with(browser));
    }

    //@Test
    public void whenGoogleSearchSerenityThenShouldSeeBDD() {
        givenThat(kitty).wasAbleTo(StartWith.googleSearchPage());

        when(kitty).attemptsTo(SearchForKeyword.of("Serenity BDD"));

        then(kitty).should(seeThat(GoogleSearchResults.displayed(), hasItem(containsString("Introduction to BDD Test Automation"))));
    }

}