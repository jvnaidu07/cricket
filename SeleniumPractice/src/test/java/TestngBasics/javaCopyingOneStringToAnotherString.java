package TestngBasics;

public class javaCopyingOneStringToAnotherString {
    public static void main(String[] args) {
        String s = "venkat";
        char y[] = s.toCharArray();
        int size = y.length;
        char a[] = new char[size];
        int i=0;
        while (i!=size){
            a[i] = y[i];
            ++i;

        }
        System.out.println(a);
        System.out.println(y);
    }
}
