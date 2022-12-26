public class TryCatch {
    public static void main(String[] args) {
        int x=0;
        try {
            int i = 20;
            int j = 9;
            x = i / j;

        }
        catch (ArithmeticException exception) {

            System.out.println("output is ");
        }
        finally {
            System.out.println("output is "+x);
        }
    }
    }
