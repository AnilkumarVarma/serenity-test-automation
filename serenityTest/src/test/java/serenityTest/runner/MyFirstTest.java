package serenityTest.runner;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import serenityTest.model.Commodity;
import serenityTest.step.MyFirstTestStep;

@RunWith(SerenityRunner.class)
public class MyFirstTest {


    @Steps 
    private MyFirstTestStep myFirstStep;
 
    @Test
    public void membersShouldStartWithBronzeStatus() {
        myFirstStep.aMemberHasPointsOf(100);
        myFirstStep.theMemberShouldHaveAStatusOf("Bronze");
        Commodity myCommodity = null;
		myFirstStep.aMemberExchangeA(myCommodity);
    }
    
}
