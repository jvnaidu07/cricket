package JavaQuestions;

public class PalindromeProgram {
    public static void main(String[] args) {
        String x = "refer";

        char a[] = x.toCharArray();
        int size = a.length;

        char b[] = new char[size];

        int i=0;
        while (i!=size){
            b[size-1-i] = a[i];
            ++i;
        }
        //palindrome examples refer, level,civic, race car etc...
        i=0;
        while (i!=size){
            if (b[i]!=a[i]){
                System.out.println("not a palindrome");
                System.exit(0);
            }
            else {
                ++i;
                continue;
            }
        }
        System.out.println("palindrome");
        System.exit(0);

    }
}
