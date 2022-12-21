package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By loginButton() {
        return By.xpath("//input[@value='Login']");}
    private By showPasswordIcon() {
        return By.className("password-icon");}
    private By emailField() {
            return By.xpath("//input[@name='username']");}
    private By passwordField() {
            return By.xpath("//input[@name='password']");}
    private By forgotPassword() {
        return By.className("forgot-password-text");}
    private By dashboard() {
            return By.className("dashboardLeft");
    }
    private By errorMessage() {
            return By.className("error-message");
    }
    public void clickLoginBtn() {
        $(loginButton()).click();
    }
    public void clickShowPasswordIcon() {
        $(showPasswordIcon()).click();
    }
    public void clickEmailField() {
        $(emailField()).click();
    }
    public void clickPasswordField() {
        $(passwordField()).click();
    }
    public void clickForgotPassword() {
        $(forgotPassword()).click();
    }
    public void dashboardDispaly() {
        $(dashboard()).isDisplayed();
    }
    public void errorMessageDispaly() {
        $(errorMessage()).isDisplayed();
    }
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }
    public void logindUrl() {
        openUrl("https://my-invoice-eight.vercel.app/login");
    }
}
