package Starter.stepDefinitions;

import Starter.Pages.Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {

    @Steps
    Login login;
    @Given("I set url login")
    public void iSetUrlLogin() {
        login.logindUrl();
    }

    @When("I input email {string}")
    public void iInputEmail(String arg0) {
        login.clickEmailField();
        login.inputEmail(arg0);

    }

    @And("I input password {string}")
    public void iInputPassword(String arg0) {
        login.clickPasswordField();
        login.inputPassword(arg0);
    }

    @Then("I get login message {string}")
    public void iGetLoginMessage(String result) {
        login.clickLoginBtn();
        if (result.equals("success")) {
            login.dashboardDispaly();
        } else if (result.equals("failed")) {
            login.errorMessageDispaly();
        }
    }

    @When("I input valid email")
    public void iInputValidEmail() {
        login.clickEmailField();
        login.inputEmail("abdullah.nouval@gmail.com");
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        login.clickPasswordField();
        login.inputPassword("Test1234");
    }

    @And("I click show password")
    public void iClickShowPassword() {
        login.clickShowPasswordIcon();
    }

    @And("I click login button")
    public void iClickLoginButton() {
        login.clickLoginBtn();
    }

    @Then("I go to dashboard")
    public void iGoToDashboard() {
        login.dashboardDispaly();
    }

    @When("I click forgot password button")
    public void iClickForgotPasswordButton() {
        login.clickForgotPassword();
    }

    @Then("I go to reset password page")
    public void iGoToResetPasswordPage() {
    }
}
