package JavaQuestions;

import java.util.Locale;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        String x = "hello world";
        String y = x.toUpperCase(Locale.ROOT);
        System.out.println(y);
    }
}
