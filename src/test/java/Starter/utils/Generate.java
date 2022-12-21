package Starter.utils;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;

public class Generate {
    public String randomEmail(){
        Random random = new Random();
        String email = "test" +  random.nextInt() + "@gmail.com";
        return email;
    }
    public String randomPassword(){
        Random random = new Random();
        String password = "pass" + random.nextInt();
        return password;
    }
    public String randomUsername(){
        Random random = new Random();
        String username = "lengkap" +  random.nextInt();
        return username;
    }
}
