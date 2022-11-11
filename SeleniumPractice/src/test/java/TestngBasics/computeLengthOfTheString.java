package TestngBasics;

public class computeLengthOfTheString {
    public static void main(String[] args) {

        String str = "venkateswara";
        str = str.concat("\0");
        char y[] = str.toCharArray();

        int count = 0;
        int i =0;
        while (y[i]!='\0'){
            ++count;
            ++i;
        }
        System.out.println(count);
        // or to compute the length
        String str1 = "venkateswara";
        str1.length();
        System.out.println(str1.length());



    }

}
