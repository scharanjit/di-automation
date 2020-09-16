import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.spicejet.com/");
        Thread.sleep(5000);

        chromeDriver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")).click();
        Thread.sleep(2000);

        chromeDriver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();


    }
}
