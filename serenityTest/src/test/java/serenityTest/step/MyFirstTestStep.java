package serenityTest.step;



import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Step;
import serenityTest.model.Commodity;
import serenityTest.model.Member;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;
public class MyFirstTestStep {
	 private Member member;
	 
	    @Step("Given a member has {0} points")
	    public void aMemberHasPointsOf(int points) {
	        member = Member.withInitialPoints(points);
	    }
	 
	    @Step("Then the member grade should be {0}")
	    public void theMemberShouldHaveAStatusOf(String grade) {
	        assertThat( member.getGrade(), equalTo(grade));
	    }

	    @Pending
	    @Step("When the member exchange {}")
	    public void aMemberExchangeA(Commodity commodity){
	        //TODO
	    }
		
}
