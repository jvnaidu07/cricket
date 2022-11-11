package TestngBasics;

public class javaTrimConcept {
    public static void main(String[] args) {
        //trim concept is to remove the unwanted spaces
        int len;
        String s = "    Hello world   ";
        len = s.length();
        System.out.println("length of the string before applying trim " + len);
        System.out.println(s);
        s = s.trim();
        len = s.length();
        System.out.println("length of the string after applying trim " + len);
        System.out.println(s);

    }
}
