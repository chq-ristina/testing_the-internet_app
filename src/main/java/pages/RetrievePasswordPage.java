package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrievePasswordPage {
    private WebDriver driver;

    public RetrievePasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public String getStatusText(){
        return driver.findElement(By.tagName("h1")).getText();
    }
}
