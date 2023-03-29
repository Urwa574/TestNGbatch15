package Class1;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void Login(){
      //  System.out.println("i am here"); //if this test case fail than the depends on method will also not execute
        System.out.println(6/0); //lets fails this test and check if depends on method execute or not
    }
    @Test(dependsOnMethods = {"Login"} )
    public void DashBoardverification(){
        System.out.println("after login i am verifying dashboard");
    }
}
