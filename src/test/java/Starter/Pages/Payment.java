package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Payment extends PageObject {
    private By paymentpage() {
        return By.xpath("//a[text()='Invoices']");}
    private By successRadioButton() {
        return By.id("radio2");}
    private By pendingRadioButton() {
        return By.id("radio3");}
    private By statusPayment() {
        return By.className("invoice-title");}

    public void clickPaymentBtn() {
        $(paymentpage()).click();
    }
    public void clickSuccessBtn() {
        $(successRadioButton()).click();
    }
    public void clickPendingBtn() {
        $(pendingRadioButton()).click();
    }
    public void statusPaymentDispaly() {
        $(statusPayment()).isDisplayed();
    }
}
