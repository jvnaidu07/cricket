public class BC {
    public void test(int a){
        System.out.println(1);
    }
    public int test(int a,int b){
        System.out.println(1+2);
      return (a+b);
    }
    public int test(int a,int b,int c){
        System.out.println(1+2+3);
        return (a+b+c);
    }

    public static void main(String[] args) {
        BC ref=new BC();
        ref.test(1);
        ref.test(2,3);
        ref.test(1,2,3);
    }
}
