package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Register extends PageObject {
    private By nextButton() {
        return By.xpath("//*[@class = 'button-primary d-flex justify-content-center']");}
    private By emailField() {
        return By.xpath("//input[@name='email']");}
    private By usernameField() {
        return By.xpath("//input[@name='username']");}
    private By passwordField() {
        return By.xpath("//input[@name='password']");}
    private By confirmPasswordField() {
        return By.xpath("//input[@name='confirmPassword']");}
    private By merchantNameField() {
        return By.xpath("//input[@name='merchant_name']");}
    private By merchantAddressField() {
        return By.xpath("//input[@name='merchant_address']");}
    private By bankAccount() {
        return By.className("register-add-bank-container");}
    private By chooseBankAccount() {
        return By.className("form-select");}
    private By chooseBankBCA() {
        return By.xpath("//option[@value='1']");}
    private By chooseBankBNI() {
        return By.xpath("//option[@value='2']");}
    private By chooseBankMandiri() {
        return By.xpath("//option[@value='3']");}
    private By cardNumberField() {
        return By.xpath("//input[@name='bank_number']");}
    private By cardHolderNameField() {
        return By.xpath("//input[@placeholder='e.g Alvin W']");}
    private By addCardButton() {
        return By.className("modal-filter-submit-button");}
    private By signUpButton() {
        return By.xpath("//div[@class='button-primary d-flex justify-content-center']");}
    private By errorMessage() {
        return By.className("error-message");}
    private By successMessage() {
        return By.xpath("//h2[text()='Register Succeed']");}

    public void registerUrl() {
        openUrl("https://my-invoice-eight.vercel.app/register");
    }
    public void clickNextBtn() {
        $(nextButton()).click();
    }
    public void clickEmailField() {
        $(emailField()).click();
    }
    public void clickUsernameField() {
        $(usernameField()).click();
    }
    public void clickPasswordField() {
        $(passwordField()).click();
    }
    public void clickConfirmPasswordField() {
        $(confirmPasswordField()).click();
    }
    public void clickMerchantNameField() {
        $(merchantNameField()).click();
    }
    public void clickMerchantAddressField() {
        $(merchantAddressField()).click();
    }
    public void clickBankAccount() {
        $(bankAccount()).click();
    }
    public void clickChooseBankAccount() {
        $(chooseBankAccount()).click();
    }
    public void clickChooseBankBCA() {
        $(chooseBankBCA()).click();
    }
    public void clickChooseBankBNI() {
        $(chooseBankBNI()).click();
    }
    public void clickChooseBankMandiri() {
        $(chooseBankMandiri()).click();
    }
    public void clickCardNumberField() {
        $(cardNumberField()).click();
    }
    public void clickCardHolderNameField() {
        $(cardHolderNameField()).click();
    }
    public void clickAddCardBtn() {
        $(addCardButton()).click();
    }
    public void clicksignUpBtn() {
        $(signUpButton()).click();
    }
    public void errorMessageDispaly() {
        $(errorMessage()).isDisplayed();
    }
    public void successMessageDispaly() {
        $(successMessage()).isDisplayed();
    }
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }
    public void inputUsername(String username) {
        $(usernameField()).type(username);
    }
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }
    public void inputConfirmPassword(String confirmpassword) {
        $(confirmPasswordField()).type(confirmpassword);
    }
    public void inputMerchantName(String merchantname) {
        $(merchantNameField()).type(merchantname);
    }
    public void inputMerchantAddress(String merchantaddress) {
        $(merchantAddressField()).type(merchantaddress);
    }
    public void inputCardNumber(String cardnumber) {
        $(cardNumberField()).type(cardnumber);
    }
    public void inputCardHolderName(String cardholdername) {
        $(cardHolderNameField()).type(cardholdername);
    }

}
