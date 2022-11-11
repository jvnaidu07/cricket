public class fibonacciseries {
    public static void main(String[] args) {
        int a = 10, b = 0, c = 1;
        for(int i=0;i<=a;i++){
            System.out.print(b+" ,");
            int d=b+c;
            b=c;
            c=d;
        }
    }}