package JavaQuestions;

public class CopyOneStringToAnotherString {
    public static void main(String[] args) {
        String a = "mango";

        char x[] = a.toCharArray();
        int size = x.length;
        char y[] = new char[size];

        int i = 0;
        while(i!=size){
            y[i] = x[i];
            ++i;
        }
        System.out.println(x);
        System.out.println(y);


    }
}
