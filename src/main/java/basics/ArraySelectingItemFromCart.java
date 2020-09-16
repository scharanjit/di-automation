package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ArraySelectingItemFromCart {

    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(5000);


        List<WebElement> products = chromeDriver.findElements(By.cssSelector("h4.product-name"));

        for (WebElement product : products) {
            if (product.toString().contains("Cucumber - 1 Kg")) {
                chromeDriver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[3]/button")).click();
            }
        }


        Thread.sleep(10000);
        chromeDriver.close();

    }
}
