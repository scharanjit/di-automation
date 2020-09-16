import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;
import java.security.Key;

public class AutoSuggestiveDropDown {

    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.makemytrip.com/");
        Thread.sleep(5000);

        chromeDriver.findElement(By.xpath("//*[@id=\"fromCity\"]")).sendKeys("MUM");

      Thread.sleep(2000);
//        chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div")).sendKeys(Keys.ENTER);


       chromeDriver.findElement(By.xpath("//*[@id=\"fromCity\"]")).sendKeys(Keys.ARROW_DOWN);
       chromeDriver.findElement(By.id("//*[@id=\"fromCity\"]")).sendKeys(Keys.ENTER);
    }
}
