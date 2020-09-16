package waitScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(5000);



    }
}
