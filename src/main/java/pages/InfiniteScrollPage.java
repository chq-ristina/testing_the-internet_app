package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private WebDriver driver;
    By textBlocks = By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver driver){
        this.driver =driver;
    }

    /**
     * Scrolls until paragprah with index specified is in view
     * @param index 1-bsed
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;

        while (getNumberOfParagprahsPresent() < index){
            jsExecutor.executeScript(script);
        }
    }

    public int getNumberOfParagprahsPresent(){
        return driver.findElements(textBlocks).size();
    }
}
