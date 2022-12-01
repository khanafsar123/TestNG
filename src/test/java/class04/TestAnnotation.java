package class04;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestAnnotation {
    @BeforeTest
    public void BT() {
        System.out.println("I am before Test ------------------------------");
    }

    @AfterTest
    public void AT(){
        System.out.println("I am after Test --------------------------------");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("i am before suit _");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("i am after suit -_-");
    }
}