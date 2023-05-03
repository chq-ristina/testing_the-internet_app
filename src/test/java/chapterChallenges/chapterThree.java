package chapterChallenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class chapterThree {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement sContent = driver.findElement(By.linkText("Shifting Content"));
        sContent.click();

        WebElement exOne = driver.findElement(By.linkText("Example 1: Menu Element"));
        exOne.click();

        List<WebElement> links = driver.findElements(By.tagName("li"));
        System.out.println(links.size());

        driver.quit();

    }

    public static void main(String args[]){
        chapterThree test = new chapterThree();
        test.setUp();
    }
}
