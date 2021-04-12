package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
    @BeforeTest
    public void openBrowser(){
        System.out.println("...Open browser...");
    }

    @AfterTest
    public void closeBrowser(){
        System.out.println("...Close browser...");
    }


    @Test
    public void login(){
        System.out.println("Click in user icon");
        System.out.println("Click on login");
        System.out.println("Click on e-mail textbox");
        System.out.println("Type the e-mail address");
        System.out.println("Click on password textbox");
        System.out.println("Type the password");
        System.out.println("Click on login button");
    }

    @Test
    public void logout(){
        System.out.println("Click on user icon");
        System.out.println("Click on logout");
    }

}
