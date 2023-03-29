package Class1;

import org.testng.annotations.Test;

public class enableDisable {
    @Test(enabled = false) //here we disabled this test case //this is for if your test case have  bug and u don't want to run that so here's the sol
    public void Atest(){
        System.out.println(" am first test case");
    }
    @Test
    public void Btest(){ //enable=true is by default
        System.out.println(" am Second test case");
    }
    @Test(enabled = false)
    public void Ctest(){
        System.out.println(" am Third test case");
    }

}
