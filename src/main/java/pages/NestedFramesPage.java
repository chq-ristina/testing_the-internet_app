package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
    private WebDriver driver;
    private By frameText = By.tagName("body");
    private String topFrame = "frame-top";
    private String leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";

    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    public String getLeftText(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
        String text = getFrameText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getBottomText(){
        driver.switchTo().frame(bottomFrame);
        String text = driver.findElement(frameText).getText();
        driver.switchTo().parentFrame();
        return text;
    }

    public String getFrameText(){
        return driver.findElement(frameText).getText();
    }
}
