package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.spicejet.com/");
        Thread.sleep(5000);

        chromeDriver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_SeniorCitizenDiv\"]")).click();
        Thread.sleep(5000);
        chromeDriver.findElement(By.xpath("//*[@id=\"familyandfriend\"]")).click();
        System.out.println(chromeDriver.findElement(By.xpath("//*[@id=\"familyandfriend\"]")).isSelected());


        chromeDriver.findElement(By.id("divpaxinfo")).click();
        Select select = new Select(chromeDriver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        select.selectByValue("5");

        chromeDriver.findElement(By.id("flightSearchContainer")).click();
        /**
         * Get Number of checkboxes on the page
         *
         */
        System.out.println(chromeDriver.findElements(By.cssSelector("input[type='checkbox']")).size());

    }
}
