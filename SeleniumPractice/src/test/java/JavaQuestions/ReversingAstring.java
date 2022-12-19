package JavaQuestions;

public class ReversingAstring {
    public static void main(String[] args) {
        String a = "123456";
        int e = 10;

        char y[]= a.toCharArray();
        int size = y.length;
        char x[] = new char[size];

        int i=0;
        while (i!=size)
        {
           x[size-1-i] = y[i];
           ++i;
        }
        //string to integer
        int c = Integer.parseInt(a);
        //integer to string
        String d = Integer.toString(e);

        System.out.println(x);
        System.out.println(a);
        System.out.println(e);

    }
}
