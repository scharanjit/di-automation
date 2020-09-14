import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanmicTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello mac");

//        System.getProperty("webdriver.chrome.driver","/Users/charanjiths/Documents/di-automation/chromedriver");
        // chrome driver should be present in project folder
        System.getProperty("webdriver.chrome.driver","chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        /**
         * Dynamic Dropdowns
         */

        chromeDriver.get("https://www.spicejet.com/");

        Thread.sleep(10000);

        chromeDriver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();

        Thread.sleep(3000);
        chromeDriver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[7]/a")).click();

        Thread.sleep(1000);
//        chromeDriver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[8]/a")).click();
        chromeDriver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        // tagName[@Attribute='value']
        // since it is dyanmic, there shall be two chennai
        // we need to select 2nd one


    }
}
