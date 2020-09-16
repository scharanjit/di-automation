import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpInSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(5000);

        chromeDriver.findElement(By.id("alertbtn")).click();
        System.out.println(chromeDriver.switchTo().alert().getText());
        Thread.sleep(3000);
        chromeDriver.switchTo().alert().accept();
        Thread.sleep(2000);
        chromeDriver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);

        System.out.println(chromeDriver.switchTo().alert().getText());
        chromeDriver.switchTo().alert().dismiss();



        Thread.sleep(5000);
        chromeDriver.close();
    }
}
