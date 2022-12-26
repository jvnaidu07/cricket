package JavaQuestions;

public class RemoveAndReplace {
    public static void main(String[] args) {
        String str = "welcome to java   world";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
