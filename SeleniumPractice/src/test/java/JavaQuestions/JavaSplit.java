package JavaQuestions;

public class JavaSplit {
    public static void main(String[] args) {
        String x = "a/b/c/d";
        String a[] = x.split("/");
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
