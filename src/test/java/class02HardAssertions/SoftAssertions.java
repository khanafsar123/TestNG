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
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SoftAssertions {


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
        String ExpectedErrorMsg="Invalid credentials";


        // create instance of the softAssert

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(ActualErrorMsg, ExpectedErrorMsg);

        //check if the webElement error message isDisplayed
        boolean isDisplayed=errorMSG.isDisplayed();

        softAssert.assertTrue(isDisplayed);




        //Write in last
        // Assert all the assertions tha have been made
        softAssert.assertAll();


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
