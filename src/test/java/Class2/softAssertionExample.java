package Class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class softAssertionExample {
    public static WebDriver driver;
    //go to syntax hrm
    //send cno credentials and click on login button
    //verify the error message is username can not be empty
    @BeforeMethod
    public void SetUpBrowser() {
        WebDriverManager.chromedriver().setup(); //setting chrome driver
        driver = new ChromeDriver(); //calling chrome
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void closeBrowser() {

        driver.quit();
    }
    @Test
    public void testCase(){
        //find the login button and click
        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='Submit']"));
        loginBtn.click();
        //get the error message
        WebElement error=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        String actualError=error.getText();
        //strings that contains my error message
        String expectedError="Username cannot be empty"; //now failing the test
        //for Soft assertion
        SoftAssert soft=new SoftAssert();
        //compare
        soft.assertEquals(actualError,expectedError);
        //   login button is displayed or not
        boolean disp = loginBtn.isDisplayed();
        System.out.println("the state of the display login is"+disp);
//        call soft assertion
        soft.assertTrue(disp);
        //passes the result case telling u which one is fail and which one pass
        //this is must to do in soft assertion after making all the assertion
        soft.assertAll();
    }

}
