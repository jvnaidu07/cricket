package TestngBasics;

public class ReversingString {
    public static void main(String[] args) {
        String a = "1234567";

        char y[] = a.toCharArray();
        int size = y.length;
        char x[] = new char[size];

        int i=0;

        while (i!=size)
        {
            x[size-1-i] = y[i];
            ++i;
        }
       // System.out.println(y);
        System.out.println(x);
    }
}
