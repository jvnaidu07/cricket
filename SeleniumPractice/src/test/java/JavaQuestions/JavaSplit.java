package JavaQuestions;

public class JavaSplit {
    public static void main(String[] args) {
       String a = "w-a-t-e-r";
       String str[] = a.split("-");
       for (int i=0; i< str.length; i++){
           System.out.println(str[i]);
       }
    }
}
