package com.tasks.evalartapp.stepdefinitions;

import com.tasks.evalartapp.tasks.Form;
import com.tasks.evalartapp.utils.Generate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class FormsStepDefinitions {

    @Managed
    WebDriver driver;

    @Given("actor enters the page")
    public void actorEntersThePage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Elkin").whoCan(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://tasks.evalartapp.com/automatization/"));
    }
    @When("to send information for the login and valite {string} times")
    public void toSendInformationForTheLoginAndValiteTimes(String times) {
        OnStage.theActorInTheSpotlight().attemptsTo(Form.format(Generate.dates(),times));
    }
    @Then("I see the make of the car {string}")
    public void iSeeTheMakeOfTheCar(String string) {

    }
}
