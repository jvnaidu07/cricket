package TestngBasics;

import org.testng.annotations.Test;

public class InfiniteLoopTest {
    @Test(invocationTimeOut = 2000,expectedExceptions=NumberFormatException.class)
    public void infiniteLoopTest() {
        int i = 1;
        while (i == 1) {
            System.out.println(i);
        }
    }
}
