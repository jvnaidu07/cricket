package moreJavaExamples;

public class TernaryOperator {
    public static void main(String[] args) {

//Ternary operator we can use ?: these two ? this is for true and : this is for false
        int num1=10;
        int num2=20;
        if (num1>num2){
            System.out.println("num1>num2");
        }
        else {
            System.out.println("num1<num2");
        }
        String result=(num1>num2) ? "num1>num2"  : "num1<num2";
        System.out.println(result);

        boolean result1=(num1<num2) ? true:false;
        System.out.println(result1);
    }
}
