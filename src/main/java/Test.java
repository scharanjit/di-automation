import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello mac");

//        System.getProperty("webdriver.chrome.driver","/Users/charanjiths/Documents/di-automation/chromedriver");
        // chrome driver should be present in project folder
        System.getProperty("webdriver.chrome.driver","chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
//        chromeDriver.get("http://google.com");
//        //validate title of page
//        System.out.println(chromeDriver.getTitle());
//
//        // validate URL -- no redirection
//        System.out.println(chromeDriver.getCurrentUrl());
//
//        // check page source
//        System.out.println(chromeDriver.getPageSource());
//
//        chromeDriver.get("http://yahoo.com");
//
//        // check page source
//        System.out.println(chromeDriver.getPageSource());
//
//        //go back
//        chromeDriver.navigate().back();
//
//        //closes current browser
//        chromeDriver.close();
//
//        // close all browsers open by selenium
////        chromeDriver.quit();

        chromeDriver.get("https://home.dev.di.veranalocal.com/login");
        System.out.println(chromeDriver.getTitle());
        chromeDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();

        chromeDriver.findElement(By.id("tikta-signin-username")).sendKeys("xxx.test@mayoo.com");
        chromeDriver.findElement(By.id("tikta-signin-password")).sendKeys("XXXXX!");

        chromeDriver.findElement(By.xpath("//*[@id=\"tikta-signin-submit\"]")).click();


        Thread.sleep(5000);
        chromeDriver.navigate().refresh();
        Thread.sleep(1000);

//        chromeDriver.findElement(By.cssSelector("button.btn.btn-primary.btn-flat.m-b-30.m-t-30")).click();
        chromeDriver.findElement(By.id("tikta-signin-username")).sendKeys("charanjit.singh@mayoo.com");
//        chromeDriver.findElement(By.id("tikta-signin-username")).sendKeys("xxx.test@mayoo.com");
//        chromeDriver.findElement(By.id("tikta-signin-password")).sendKeys("XXXXX!");
        chromeDriver.findElement(By.id("tikta-signin-password")).sendKeys("BDsjhds");

        chromeDriver.findElement(By.xpath("//*[@id=\"tikta-signin-submit\"]")).click();

////        wait time
        WebDriverWait wait = new WebDriverWait (chromeDriver, 15);
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form1\"]/div[1]/div[1]/div/div/p")));
//
//
//        System.out.println(chromeDriver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/div[1]/div/div/p")).getText());

        System.out.println(chromeDriver.getTitle());
        System.out.println(chromeDriver.getTitle());
        System.out.println(chromeDriver.getTitle());
//        chromeDriver.get("htto://facebook.com");
//        chromeDriver.findElement(By.id("email"));


        //Syntax of XPath
        //  //tagName[@attribute='value']

        // <input type="text" placeholder="" name="username" id="tikta-signin-username" value="" aria-label="" autocomplete="off" required="">

        // TagName = input
        // attribute = name
        //value = username
         // Xpath shall be
        // //input[@name='username']

        //test this in console

        /**
         *
         *
         * $x("//input[@name='username']")
         * [input#tikta-signin-username]
         *
         */


        // The tag name mentioned in Xpath can be replaced with *
        // in this case it will search for that attribute everywhere
        // //*[@name='username']


        // CSS selector
        /**
         * Syntax
         *
         *  //tagName[attribute='value']
         *
         * Two more syntax
         *  tagName#id
         *  tabName.classname
         *
         *
         */

        Boolean element = wait.until(ExpectedConditions.urlToBe("https://home.dev.di.veranalocal.com/secure/home"));


        System.out.println(chromeDriver.getCurrentUrl().equals("https://home.dev.di.veranalocal.com/secure/home"));

//        chromeDriver.get("https://home.dev.di.veranalocal.com/secure/deployment/form");

        chromeDriver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/a")).click();
        Thread.sleep(2000);
//        chromeDriver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/ul/li[3]/i")).isSelected();
        chromeDriver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/ul/li[3]")).click();
//        chromeDriver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[5]/ul/li[3]/a")).click();
//        Thread.sleep(2000);
//        Boolean element1 = wait.until(ExpectedConditions.urlToBe("https://home.dev.di.veranalocal.com/secure/deployment/form"));


        chromeDriver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement element2 = chromeDriver.findElement(By.xpath("//*[@id=\"host_description\"]"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", element2);
        Thread.sleep(1000);

        chromeDriver.findElement(By.xpath("//*[@id=\"host_description\"]")).sendKeys("Automation-"+System.currentTimeMillis());

        Thread.sleep(2000);




        // regular expression
        // < input name = "username123">
        // tagName[contains(@attribute,'value')]  -- xpath
        // inout[contains(@name,'username')]    -- regular exp vala xpath

        // For CSS
        /**
         * tagName[Attribute*='value']  CSS regular expression
         *
         * input[name*='username']
         *
         *Scenario:- Attribute value is too long
         *          where the attribute is common
         */



        Select s_practice_ids = new Select(chromeDriver.findElement(By.id("im_practice_id")));
//        s_practice_ids.selectByValue();
//        s_practice_ids.selectByIndex(1);
        s_practice_ids.selectByVisibleText("Yellow Eye");
        Thread.sleep(1000);

        Select s_im_emr_id = new Select(chromeDriver.findElement(By.id("im_emr_id")));
        s_im_emr_id.selectByVisibleText("GenNext");


        Thread.sleep(1000);
        Select s_im_location_id = new Select(chromeDriver.findElement(By.id("im_location_id")));
        s_im_location_id.selectByVisibleText("Yellow Eye");


        Thread.sleep(1000);
        Select s_im_contact_id = new Select(chromeDriver.findElement(By.id("im_contact_id")));
        s_im_contact_id.selectByVisibleText("Mike Noftzger");
        Thread.sleep(1000);


        WebElement element3 = chromeDriver.findElement(By.xpath("//*[@id=\"yoga_mau\"]"));
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView(true);", element3);
        Thread.sleep(1000);


        chromeDriver.findElement(By.xpath("//*[@id=\"yoga_mau\"]")).sendKeys("01/01/2019");

        Thread.sleep(1000);


        chromeDriver.findElement(By.xpath("//*[@id=\"payment-button-amount\"]")).click();






    }
}
