public class MaxAmongfour {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        if (a>b){
            if (a>c){
                if (a>d){
                    System.out.println("Max is "+a);
                }
                else {
                    System.out.println("Max is "+d);
                }
            }
        else {
                if (c>d){
                    System.out.println("Max is "+c);
            }
                else {
                    System.out.println("Max is "+d);
            }
            }
        }
        else{
                if (b>c){
                    if (b>d){
                     System.out.println("Max is "+b);
                    }
                else {
                     System.out.println("Max is "+d);
                    }
            }
                else {
                if (c>d){
                     System.out.println("Max is "+c);
                    }
                else {
                     System.out.println("Max is "+d);
                }
                }
        }

    }
}
