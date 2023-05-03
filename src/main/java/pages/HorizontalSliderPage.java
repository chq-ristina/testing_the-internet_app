package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;

    private By sliderContainer = By.className("sliderContainer");
    private By slider = By.cssSelector(".sliderContainer input");
    private By sliderAmount = By.tagName("span");

    public HorizontalSliderPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnSlider(){
        driver.findElement(sliderContainer).click();
    }

    public void moveSlider(double x){
        for (int i = 0; i < x * 2; i++){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }

    }

    public String getSliderAmount(){
        return driver.findElement(sliderAmount).getText();
    }
}
