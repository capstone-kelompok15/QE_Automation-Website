package Starter.Pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Dashboard extends PageObject {

    private By showStatButton() {
        return By.xpath("//button[@data-bs-toggle='dropdown']");}
    private By showStatLast7Days() {
        return By.xpath("//a[text()='Last 7 days']");}

    public void clickShowStatBtn() {
        $(showStatButton()).click();
    }
    public void clickShowStatLast7Days() {
        $(showStatLast7Days()).click();
    }
    public void statLast7DaysDisplay() { $(showStatLast7Days()).isDisplayed();
    }

}
