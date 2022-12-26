public class IfElse {
    public static void main(String[] args) {
        int a=111;
        int b=82;
        int c=11;
        int d=15;
        if (a>b){
            if (a>c){
                if (a>d){
                    System.out.println("Max number is"+a);
                }
                else {
                    System.out.println("Max number is"+d);
                }
            }
            else {
                if (b>c){
                    System.out.println("Max number is"+b);
                }
                else {
                    System.out.println("Max number is"+c);
                }
            }

        }
        else {
            if (c>d){
                    System.out.println("Max number is"+c);
            }
            else {
                    System.out.println("Max number is"+d);
            }
        }
    }
}
