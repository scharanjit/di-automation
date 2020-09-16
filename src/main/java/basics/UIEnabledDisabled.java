package basics;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIEnabledDisabled {

    public static void main(String[] args) throws InterruptedException {
        System.getProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver chromeDriver = new ChromeDriver();

        chromeDriver.get("https://www.spicejet.com/");
        Thread.sleep(5000);

        chromeDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(chromeDriver.findElement(By.id("Div1")).getAttribute("style"));

        if(chromeDriver.findElement(By.id("Div1")).getAttribute("style").equals("display: block; opacity: 1;")) {
            System.out.println("Enabled");
        }else {
            System.out.println("Disabled");
        }
        Thread.sleep(2000);

        chromeDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
//        System.out.println(chromeDriver.findElement(By.id("Div1")).isEnabled());
        // this always show true
        //issue with html

        /**
         * Use style attribute
         */
        System.out.println(chromeDriver.findElement(By.id("Div1")).getAttribute("style"));

        if(chromeDriver.findElement(By.id("Div1")).getAttribute("style").equals("display: block; opacity: 1;")) {
            System.out.println("Enabled");
        }else {
            System.out.println("Disabled");
        }

        Thread.sleep(4000);

        chromeDriver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(chromeDriver.findElement(By.id("Div1")).getAttribute("style"));

        if(chromeDriver.findElement(By.id("Div1")).getAttribute("style").equals("display: block; opacity: 1;")) {
            System.out.println("Enabled");
        }else {
            System.out.println("Disabled");
        }
        Thread.sleep(2000);

//        System.out.println(chromeDriver.findElement(By.id("Div1")).isEnabled());

        Thread.sleep(10000);
        chromeDriver.close();

    }
}
