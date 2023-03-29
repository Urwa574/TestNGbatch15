package Class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGannotations {
    @BeforeMethod
    public void beforeMethods(){ //we can write this method anywhere no need to follow order up to u
        System.out.println("i am before method ");
    }
    @AfterMethod
    public void afterMethod(){ //we can write it anywhere
        System.out.println("i am after method");
    }
    @Test(groups = "regression")
    public void aFirstTestCase(){
        System.out.println("i am the first test case");
    }
    @Test
    public void bSecondTestCase(){
        System.out.println("i am the second test case");
    }
@Test
    public void cThirdTestCase(){
    System.out.println("i am the third test case");
}
}
