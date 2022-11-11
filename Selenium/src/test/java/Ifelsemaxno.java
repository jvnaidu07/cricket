public class Ifelsemaxno {
    public static void main(String[] args) {
        int a = 12, b = 13, c = 0, d = 25;
        if (a > b & a > c & a > d) {
            System.out.println(a);
        }
        else if (b>a & b>c & b>d){
            System.out.println(b);
        }
        else if(c>a & c>b & c>d){
            System.out.println(c);
        }
        else {
            System.out.println(d);
        }
    }

}