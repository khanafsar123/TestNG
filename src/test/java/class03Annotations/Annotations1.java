package class03Annotations;

import org.testng.annotations.*;

public class Annotations1 {

        @BeforeTest
        public void BeforeTest() {
            System.out.println("I am before Test");
        }

        @BeforeClass
        public void BeforeClass() {
            System.out.println("I am before Class");
        }

        @BeforeMethod
        public  void BeforeMethod(){
            System.out.println("I am Before Method");
        }
        @Test
        public void AFirstTest(){
            System.out.println("I am A 1 Test");
        }


        @Test
        public void BSecondTest(){
            System.out.println("I am B 2 Test");
        }

        @AfterMethod
        public  void AfterMethod(){
            System.out.println("I am After Method");
        }

        @AfterClass
    public void AfterClas() {
            System.out.println("I am after the class");
        }

    @AfterTest
    public void AfterTest() {
        System.out.println("I am after the Test");
    }


}
