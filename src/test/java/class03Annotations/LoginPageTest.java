package class03Annotations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageTest {
    public static WebDriver driver;

    //    writing down all the pre conditions for a test case
    @BeforeMethod
    public void SetupBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @DataProvider(name="credentials")
    public Object[][] data(){
        Object[][] loginData = {
                {"Admin", "12345", "Invalid credentials"},
                {"ABCD", "Hum@nhrm123", "Invalid credentials"},
                {"Admin", "", "Password cannot be empty"},
                {"", "Hum@nhrm123", "Username cannot be empty"}
        };
        return loginData;

    }





    @Test (dataProvider = "credentials")
    public void LoginWithInvalidCredentials(String userName, String Password, String ExpectedErrorMessage){
        //finding the username text box
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        //send username
        username.sendKeys(userName);
        //        finding the password field
        WebElement pswrd = driver.findElement(By.xpath("//input[@id='txtPassword']"));
//        send password
        pswrd.sendKeys(Password);
        //        finding the element login btn
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        click the login
        loginBtn.click();
//             get the element message invalid crdentials
        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        //        extract the error message
        String actualError = errorMsg.getText();
//assertion
        Assert.assertEquals(actualError,ExpectedErrorMessage);

    }



    @AfterMethod
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
