package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RadioButtons {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://echoecho.com/htmlforms10.htm");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // This  will scroll down the page by  1000 pixel vertical
        js.executeScript("window.scrollBy(0,1400)");

        Thread.sleep(300);


        driver.findElement(By.xpath("//input[@value='Milk']")).click();

        int sizeGroup1= driver.findElements(By.xpath("//input[@name='group1']")).size();
        System.out.println(sizeGroup1);

        List<WebElement> list1 = new ArrayList<WebElement>();

        driver.findElements(By.xpath("//input[@name='group1']"));




        for(int i= 0; i<sizeGroup1;i++){
            String s =driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
            System.out.println(s);

            Thread.sleep(2000);




        }







    }
}
