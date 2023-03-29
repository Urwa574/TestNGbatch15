package Class1;

import org.testng.annotations.Test;

public class priority {
    @Test(priority = 3)
    public void Atest(){
        System.out.println("i am TestA");
    }
    @Test(priority = 1)
    public void Btest(){
        System.out.println("i am TestB");
    }
    @Test (priority = 2)
    public void Ctest(){ //we can set priority according to our own choice
        System.out.println("i am TestC");
    }
}
