public class KG extends GK{
    public void test(){
        System.out.println("harish");
    }

    public static void main(String[] args) {
        KG k=new KG();
        k.test();
        k.test1();
    }
    @Override
    public void test1() {
        System.out.println("kalyaan");
    }
}
