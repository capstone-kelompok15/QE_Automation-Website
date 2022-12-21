package Starter.stepDefinitions;

import Starter.Pages.Dashboard;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class DashboardSteps {

    @Steps
    Dashboard dashboard;
    @When("I set show stat last seven days")
    public void iSetShowStatLastSevenDays() {
        dashboard.clickShowStatBtn();
        dashboard.clickShowStatLast7Days();
    }

    @Then("show stat change to seven days")
    public void showStatChangeToSevenDays() {
        dashboard.statLast7DaysDisplay();
    }
}
