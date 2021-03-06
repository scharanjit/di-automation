package waitScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitExample {

    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");


        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};

        addItems(chromeDriver, itemsNeeded);

        chromeDriver.findElement(By.cssSelector("a.cart-icon")).click();
        chromeDriver.findElement(By.cssSelector("div.action-block")).click();

        chromeDriver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        chromeDriver.findElement(By.cssSelector("button.promoBtn")).click();

        /**
         * Explicit wait
         */
        WebDriverWait w = new WebDriverWait(chromeDriver,5);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println(chromeDriver.findElement(By.cssSelector("span.promoInfo")).getText());
    }

    private static void addItems(WebDriver chromeDriver, String[] itemsNeeded) {

        List<WebElement> elementList = chromeDriver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < elementList.size(); i++) {
            for (String s : itemsNeeded) {
                if (elementList.get(i).getText().contains(s)) {
                    chromeDriver.findElements(By.cssSelector("div.product-action")).get(i).click();
                }
            }
        }

    }
}
