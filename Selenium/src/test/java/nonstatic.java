public class nonstatic {
    void name(){
        System.out.println("murali");
    }
    public int num(){
        System.out.println(10);
        return 10;
    }
    String val(){
        System.out.println("charan");
        return "charan";
    }

    public static void main(String[] args) {
        nonstatic n=new nonstatic();
        n.name();
        n.num();
        n.val();
    }
}
