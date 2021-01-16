package stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import sun.misc.Launcher;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

import java.util.List;

public class ChoucairAcademyStepDefinitions {


    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast()); }

    @Given("^than juan wants to learn automation at the academy choucair$")
    public void thanJuanWantsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> AcademyChoucairData) throws Exception{
        OnStage.theActorCalled("juan").wasAbleTo(OpenUp.thePage(), (
                Login.OnThePage(AcademyChoucairData.get (0).getStrUser (),AcademyChoucairData.get (0).getStrPassword ())));

    }


    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(List<AcademyChoucairData> AcademyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(AcademyChoucairData.get (0).getStrCourse ()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> AcademyChoucairData)
            throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.theTo(AcademyChoucairData.get (0).getStrCourse ())));
    }

}
