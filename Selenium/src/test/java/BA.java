public class BA extends AB {
    public void test(int a){
        System.out.println(6);
    }

    public static void main(String[] args) {
        BA ref=new BA();
        ref.test(3);
    }
}
