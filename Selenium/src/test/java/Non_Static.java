public class Non_Static {
    static void  name(){
        System.out.println("venkat");
    }
    public int num(){
        System.out.println(10);
        return  10;
    }
    String val (){
        System.out.println("Charan");
        return "Charan";
    }

    public static void main(String[] args) {

        Non_Static n= new Non_Static();
        n.name();
        n.val();
        n.num();
    }
}
