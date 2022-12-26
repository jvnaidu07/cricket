package moreJavaExamples;

public class IfElseMaximumAmong4 {
    public static void main(String[] args) {
        int a = 50;
        int b = 12;
        int c = 96;
        int d = 60;

        if (a > b) {
            if (a > d) {
                    System.out.println("the maximum number is:" + a);
                } else
                    if(b > c)
                    {
                    System.out.println("the maximum number is:" + b);

                } else
                    if (c > d)
                    {
                    System.out.println("the maximum number is:" + c);
                } else
                    if (d > c)
                    {
                    System.out.println("the maximum number is:" + d);

                }
            }
        }
    }
