package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Invoice extends PageObject {
    private By invoicepage() {
        return By.xpath("//a[text()='Invoices']");}
    private By newInvoice() {
        return By.xpath("//div[text()='New Invoices']");}
    private By filterInvoice() {
        return By.className("filter-invoice");}
    private By paidRadioButton() {
        return By.id("radio2");}
    private By unpaidRadioButton() {
        return By.id("radio3");}
    private By showResultButton() {
        return By.className("modal-filter-submit-button");}
    private By statusInvoice() {
        return By.className("invoice-title");}
    private By clientEmailField() {
        return By.xpath("//input[@placeholder='Client Email']");}
    private By client1Email() {
        return By.xpath("//div[text()='test@yopmail.com']");}
    private By dueDate() {
        return By.className("react-datepicker__input-container");}
    private By dueDate31() {
        return By.xpath("//div[text()='31']");}
    private By itemNameField() {
        return By.xpath("//input[@name='product']");}
    private By quantityField() {
        return By.xpath("//input[@name='quantity']");}
    private By priceField() {
        return By.xpath("//input[@name='price']");}
    private By createInvoiceButton() {
        return By.className("create-invoice-button");}
    private By successMessage() {
        return By.xpath("//h2[text()='Creating Invoice Succeed']");}
    private By failedMessage() {
        return By.xpath("//h2[text()='Create Invoice Failed']");}

    public void clickNewInvoice() {
        $(newInvoice()).click();
    }
    public void clickClientEmailField() {
        $(clientEmailField()).click();
    }
    public void clickClient1Email() {
        $(client1Email()).click();
    }
    public void clickDueDate() {
        $(dueDate()).click();
    }
    public void clickDueDate31() {
        $(dueDate31()).click();
    }
    public void clickItemNameField() {
        $(itemNameField()).click();
    }
    public void inputItemNameField(String itemName) {
        $(itemNameField()).type(itemName);
    }
    public void clickQuantityField() {
        $(quantityField()).click();
    }
    public void inputQuantityField(String qty) {
        $(quantityField()).type(qty);
    }
    public void clickPriceField() {
        $(priceField()).click();
    }
    public void inputPriceField(String price) {
        $(priceField()).type(price);
    }
    public void clickCreateInvoiceBtn() {
        $(createInvoiceButton()).click();
    }
    public void statusInvoiceDispaly() {
        $(statusInvoice()).isDisplayed();
    }
    public void successMassageDisplay() {
        $(successMessage()).isDisplayed();
    }
    public void failedMassageDisplay() {
        $(failedMessage()).isDisplayed();
    }
    public void clickInvoiceBtn() {
        $(invoicepage()).click();
    }
    public void clickFilterInvoiceBtn() {
        $(filterInvoice()).click();
    }
    public void clickPaidBtn() {
        $(paidRadioButton()).click();
    }
    public void clickUnpaidBtn() {
        $(unpaidRadioButton()).click();
    }
    public void clickShowResultBtn() {
        $(showResultButton()).click();
    }
}
