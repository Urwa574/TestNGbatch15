package Class1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class testNGExample {
    //    test1
//       goto syntax Hrms
//    enter the username and password , verify that u logged in
//    close the browser
    public static WebDriver driver; //declaring this on global level thats how we don't need to declare every time and we can use this anywhere
    //   pre conditions---> to open the browser
//  to set implicit wait
    @BeforeMethod(alwaysRun = true)
    public void SetUpBrowser(){
        WebDriverManager.chromedriver().setup(); //setting chrome driver
       driver=new ChromeDriver(); //calling chrome
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    //post-condition--> to close the browser
    @AfterMethod(alwaysRun = true)
public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000); //if u want to slow it down but not recommended this method
        driver.quit();
    }
    //test case1
    //verify login functionality
    @Test(groups = "regression")
    public void loginFunction(){
        WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("Admin");
        WebElement pasword = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        pasword.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id='btnLogin']")); //* means any tag which has this path
        loginBtn.click();
    }
    //    testCase2
//    verify that password text box is displayed on the login Page
    @Test
    public void passwordTextBoxVerification(){
        // find the webElement password text box
        WebElement pasword = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        System.out.println(pasword.isDisplayed());
    }


}
