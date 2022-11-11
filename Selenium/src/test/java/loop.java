public class loop {
    int a=10;
    public void test(){
        int b=11;
        System.out.println(b);
    }
    public static void test1(){
        int c=12;
        System.out.println(c);
    }
    public static void main(String[] args) {
        loop lp=new loop();
        System.out.println(lp.a);
        lp.test();
        test1();
    }
}
