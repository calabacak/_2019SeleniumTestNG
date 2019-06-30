package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoSuggestiveDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.makemytrip.com/");
        Thread.sleep(10000);
        //driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div/div[2]/div/div/div/div/div/div")).clear();
        driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div")).click();



      //  driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div"));
        Thread.sleep(2000);
       // driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin']/div")).
 //               sendKeys("mum"+ Keys.chord(Keys.ARROW_DOWN+Keys.chord()));

    }
}
