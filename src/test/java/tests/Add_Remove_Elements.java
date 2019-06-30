package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.StringUtility;

public class Add_Remove_Elements {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to url
        driver.get("http://practice.cybertekschool.com/");
        sleep(2);
        // go to Add/Remove Elements
        driver.findElement(By.xpath("//a[@href='/add_remove_elements/']")).click();

        //check if you are on the corrcect page
        String expected = "Add/Remove Elements";

        //find the actual on the page

        String actual = driver.findElement(By.xpath("//div[@id='content']/h3")).getText();

        StringUtility.verifyEquals(""+expected,actual);
        sleep(5);
        //click add element
        driver.findElement(By.xpath("//div[@class='example']/button")).click();

        sleep(5);
        //click add element
        driver.findElement(By.xpath("//button[@class='added-manually']")).click();
        sleep(5);
        //click add element
        driver.findElement(By.xpath("//div[@class='example']/button")).click();

        sleep(15);
        driver.quit();
    }

    public static void sleep(int duration){

        try{
            Thread.sleep(duration*1000);
        }catch (Exception e){

        }

    }
}
