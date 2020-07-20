package serenityTest.screenplay.page;


import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

/**
 * @author baoqiang
 */
@DefaultUrl("https://www.google.com/ncr")
public class GoogleSearchPage extends PageObject {

    public static final Target SEARCH_RESULT_TITLES = Target.the("search results").located(By.tagName("h3"));

    public static final Target SEARCH_INPUT_BOX = Target.the("search input box").located( By.name("q"));

}