package moreJavaExamples;

public class
JavaEven {
    public static void main(String[] args) {
        //Odd-not divisible by 2
        //Even-divisible By 2
        //== equal to
        //!=not equal to
        //%- gives you the remainder
        // /- gives you the quotient

        //for even numbers
        for (int i = 20; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);

            }
        }
        //for odd numbers
        for (int i=0; i<100; i++){
            if (i%2 !=0){
                System.out.print(" "+ i +" " );
            }
        }
    }
}
