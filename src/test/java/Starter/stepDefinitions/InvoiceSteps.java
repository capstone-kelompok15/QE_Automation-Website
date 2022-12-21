package Starter.stepDefinitions;

import Starter.Pages.Invoice;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvoiceSteps {

    Invoice invoice;
    @And("I go to invoice")
    public void iGoToInvoice() {
        invoice.clickInvoiceBtn();
    }

    @When("I click filter icon")
    public void iClickFilterIcon() {
        invoice.clickFilterInvoiceBtn();
    }

    @And("I click paid radio button")
    public void iClickPaidRadioButton() {
        invoice.clickPaidBtn();
    }

    @And("I click show result button")
    public void iClickShowResultButton() {
        invoice.clickShowResultBtn();
    }

    @Then("paid invoice is display")
    public void paidInvoiceIsDisplay() {
        invoice.statusInvoiceDispaly();
    }

    @And("I click unpaid radio button")
    public void iClickUnpaidRadioButton() {
        invoice.clickUnpaidBtn();
    }

    @Then("unpaid invoice is display")
    public void unpaidInvoiceIsDisplay() {
        invoice.statusInvoiceDispaly();
    }

    @When("I click new invoice")
    public void iClickNewInvoice() {
        invoice.clickNewInvoice();
    }

    @And("I set client email")
    public void iSetClientEmail() {
        invoice.clickClientEmailField();
        invoice.clickClient1Email();
    }

    @And("I set due date")
    public void iSetDueDate() {
        invoice.clickDueDate();
        invoice.clickDueDate31();
    }

    @And("I input item name")
    public void iInputItemName() {
        invoice.clickItemNameField();
        invoice.inputItemNameField("rahasia");
    }

    @And("I input qty")
    public void iInputQty() {
        invoice.clickQuantityField();
        invoice.inputQuantityField("1");
    }

    @And("I input price")
    public void iInputPrice() {
        invoice.clickPriceField();
        invoice.inputPriceField("500000");
    }

    @And("I click create invoice")
    public void iClickCreateInvoice() {
        invoice.clickCreateInvoiceBtn();
    }

    @Then("invoice is created")
    public void invoiceIsCreated() {
        invoice.successMassageDisplay();
    }

    @Then("invoice is not created")
    public void invoiceIsNotCreated() {
        invoice.failedMassageDisplay();
    }
}
