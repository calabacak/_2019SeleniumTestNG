package tests;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
    /*
    Login Page
This is where you can log into the secure area.
Enter tomsmith for the username and SuperSecretPassword for the password.
If the information is wrong you should see error messages
     */

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");

        driver.findElement(By.name("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();

        String expepected="You logged into a secure area!";
        String actualSuccess1= driver.findElement(By.id("flash")).getText();
       // System.out.println("getText: "+ actualSuccess1);
        //String actualSuccess2= driver.findElement(By.id("flash")).getAttribute("value"); did not work
        String actualSuccess= driver.findElement(By.id("flash")).getAttribute("innerHTML");
        //System.out.println(actualSuccess);
        if(actualSuccess.contains(expepected)){
            System.out.println("Test Valid UserName and Valid Password: PASSED");
        }else {
            System.out.println("Test Valid UserName and Valid Password: FAILED");
        }

        Thread.sleep(2000);


       driver.findElement(By.xpath("//div[@id=('content')]/div/a")).click();

        Thread.sleep(2000);


// invalid userName an valid password
        driver.findElement(By.name("username")).sendKeys("invalidUserName");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.id("wooden_spoon")).click();

        String expectedNeg="Your username is invalid!";
        String actualNeg=driver.findElement(By.id("flash")).getText();
        //System.out.println("<"+actualNeg+">");
        if(actualNeg.contains(expectedNeg)){
            System.out.println("Test Invalid UserName and Valid Password: PASSED");
        }else{
            System.out.println("Test Invalid UserName and Valid Password: FAILED");
        }

        Thread.sleep(4000);

        driver.quit();



    }

    public static String verify(String actual, String expected){
        if(actual.equals(expected)){
            return "PASSED";
        }
        return "FAILED";
    }
}
