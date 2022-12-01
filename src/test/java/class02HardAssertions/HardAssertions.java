package class02HardAssertions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HardAssertions {
    WebDriver driver;

    @BeforeMethod
    public void launchTheWebsite(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.manage().window().maximize();

    }


    @Test (groups = "regression")
    public void invalidCredentials(){
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm3");
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();

        // now check whether the we have valid
        //
        // invalid credentials
        WebElement errorMSG = driver.findElement(By.xpath("//span[text()='Invalid credentials']"));
        String ActualErrorMsg = errorMSG.getText();
        String ExpectedErrorMsg="Invalid credential";
//   Assertion
        Assert.assertEquals(ActualErrorMsg,ExpectedErrorMsg);
        System.out.println("I am here after the first assertion");


        //// error message is displated

        boolean isDisplayed= errorMSG.isDisplayed();
        //System.out.println(isDisplayed);
        // Assert.assertTrue(!isDisplayed);
        Assert.assertTrue(isDisplayed); //if true pass -> if false == fail


    }


    @AfterMethod
    public void closeBrowser(){
        try {
            Thread.sleep(3000);
            driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }
}
