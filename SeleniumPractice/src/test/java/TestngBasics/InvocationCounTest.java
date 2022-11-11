package TestngBasics;

import org.testng.annotations.Test;

public class InvocationCounTest {
    @Test(invocationCount = 1)
    public void InvocationCountTest(){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("the sum is "+ c);
        //how to swap two numbers
        int temp = a;
        a=b;
        b=temp;
        System.out.println("the sum of a is ====="+ a);
        System.out.println("the sum of b is ====="+ b);
    }
}