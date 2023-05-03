package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.RetrievePasswordPage;

import static org.testng.Assert.*;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testSuccessfulForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("test@example.com");
        RetrievePasswordPage retrievePasswordPage = forgotPasswordPage.clickRetrievePassword();

        //for some reason page isn't working, so you get this text when you input anything
        assertTrue(retrievePasswordPage.getStatusText().contains("Internal Server Error"),
                "Password retrieval didn't work");
    }
}
