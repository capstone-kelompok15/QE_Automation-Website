package Starter.stepDefinitions;

import Starter.Pages.Register;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegisterSteps {

    @Steps
    Register register;
    @And("I input username {string}")
    public void iInputUsername(String arg0) {
        register.clickUsernameField();
        register.inputUsername(arg0);
    }

    @And("I input confirm password {string}")
    public void iInputConfirmPassword(String arg0) {
        register.clickConfirmPasswordField();
        register.inputConfirmPassword(arg0);
    }

    @When("I input Email {string}")
    public void iInputEmail(String arg0) {
        register.clickEmailField();
        register.inputEmail(arg0);
    }

    @And("I click next button")
    public void iClickNextButton() {
        register.clickNextBtn();
    }

    @And("I input merchant name {string} and merchant address {string}")
    public void iInputMerchantNameAndMerchantAddress(String arg0, String arg1) {
        register.clickMerchantNameField();
        register.inputMerchantName(arg0);
        register.clickMerchantAddressField();
        register.inputMerchantAddress(arg1);
    }

    @And("I add bank")
    public void iAddBank() {
        register.clickBankAccount();
        register.clickChooseBankAccount();
        register.clickChooseBankBCA();
    }

    @Given("I set url register")
    public void iSetUrlRegister() {
        register.registerUrl();
    }

    @And("I input card number {string}")
    public void iInputCardNumber(String arg0) {
        register.clickCardNumberField();
        register.inputCardNumber(arg0);
    }

    @And("card holder name {string}")
    public void cardHolderName(String arg0) {
        register.clickCardHolderNameField();
        register.inputCardHolderName(arg0);
        register.clickAddCardBtn();
    }

    @Then("I get register message {string}")
    public void iGetRegisterMessage(String result) {
        register.clicksignUpBtn();
        if (result.equals("success")) {
            register.successMessageDispaly();
        } else if (result.equals("failed")) {
            register.errorMessageDispaly();
        }
    }
}
