package moreJavaExamples;

public class OperatorsinJava {
    public static void main(String[] args) {
        //Assignment operators
        int myNumber =10;
        String str="String Demo";

        //Arithmetic operators
        int number1=10;
        int number2=20;
        System.out.println(number1+number2);
        System.out.println(number1-number2);
        System.out.println(number1*number2);
        System.out.println(number1/number2);
        System.out.println(number1+str);


        //Unary operators
        //++,--,+,- these are the unary operators
        int number3=10;
        int number4=20;
        number3++;
        number4--;
        boolean bool=true;
        boolean bool1=!true;
        System.out.println(bool1);
        System.out.println(bool);
        System.out.println(number3+number4);
        System.out.println(number3-number4);

        //equality and relational operators
        //here we  can use ==,!=,<=,>=

        int number5=10;
        int number6=20;

        if (number5==number6){
            System.out.println("Numbers are equal");
        }
        else {
            System.out.println("Numbers are not equal");
        }
        //conditional operators
        //Mainly that we can use &&,||,?:
        int number7=50;
        int number8=60;

        if ((number7==50)&&(number8==60)){
            System.out.println("This is conditional operator");
        }
        if ((number7==50)||(number8==60)){
            System.out.println("This is conditional operator");

        }

    }
}
