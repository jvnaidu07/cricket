package JavaQuestions;

public class ReversingAstring {
    public static void main(String[] args) {
        String str = "123456";

        char y[] = str.toCharArray();
        int size = y.length;
        char x[] = new char[size];

        int i=0;
        while (i!=size){
            x[size-1-i] = y[i];
            ++i;

        }
        System.out.println(x);
        int a = Integer.parseInt(str);
        System.out.println(a);


    }

    }

