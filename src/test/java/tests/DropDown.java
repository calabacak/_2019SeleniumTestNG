package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.spicejet.com/");

        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        //s.selectByIndex(3);
        s.selectByValue("USD");
        //s.selectByVisibleText("mnbv");
        //s.deselectByIndex(9);

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);

        for(int i=0; i<3; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
            Thread.sleep(2000);
        }

        //Dynamic dropdowns, loads upon user actions

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(2000);

       // driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
        //please remove index [2]
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']")).click();


        Thread.sleep(10000);
        driver.quit();

    }
}
