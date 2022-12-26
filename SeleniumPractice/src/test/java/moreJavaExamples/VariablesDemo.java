package moreJavaExamples;

public class VariablesDemo {
    //int j =20; //instance variable or global, variables
    public static void main(String[] args) {
        //type variablename= value;
        int mynumber = 10;
        int secondNumber = 20;
        char ch = 'a';
        String str = "RCV";
        System.out.println(str + " " + mynumber + " " + ch + " " + secondNumber);
        System.out.println(mynumber + secondNumber);


        //How to create a method
        //public void myMethod () {
            //inside a method we need to call it as a local variables
            int j = 9;
            int g = 99;
            int i = 20;
            int u = j + g;
            System.out.println(u);
            double x = u / i;
            System.out.println(x);

        }
    }
