package Starter.stepDefinitions;

import Starter.Pages.Payment;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class PaymentSteps {

    @Steps
    Payment payment;
    @And("I click success radio button")
    public void iClickSuccessRadioButton() {
        payment.clickSuccessBtn();
    }

    @Then("success payment is display")
    public void successPaymentIsDisplay() {
        payment.statusPaymentDispaly();
    }

    @And("I click pending radio button")
    public void iClickPendingRadioButton() {
        payment.clickPendingBtn();
    }

    @Then("failed payment is display")
    public void failedPaymentIsDisplay() {
        payment.statusPaymentDispaly();
    }

    @And("I go to payment")
    public void iGoToPayment() {
        payment.clickPaymentBtn();
    }
}
