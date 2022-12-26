package moreJavaExamples;

public class IfElseDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1>num2){
            System.out.println("num1>num2");
        }
        else if (num2>num3){
            System.out.println("num2>num3");
        }
        else if (num3>num1){
            System.out.println("num3>num1");
        }
        else {
            System.out.println("num1>num2");
        }
    }
}
