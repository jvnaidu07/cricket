package OOPsConcepts;

public class Polymorphism extends ParentClass{
    //method overridden
    public  void charger(){
        System.out.println("charger");
    }
    public void bag(){
        System.out.println("bag");
    }
    public void bottle() {
        System.out.println("bottle");
    }

    String str = "fan";
    int cost = 4000;
    String str1 = "rock";

    public Polymorphism(){
        super();
        System.out.println("zero parameter");

    }
    public Polymorphism(int i){
        System.out.println("one parameter");
        System.out.println(i);

    }
    public Polymorphism(int i, int j, int k){
        System.out.println("two parameter");
        System.out.println(i+ " " + j+ " "+ k);
    }
    public Polymorphism(String str, int cost, String rock){
        this.str = str;
        this.cost = cost;
        this.str1 = rock;
    }
//method overloading
    public static void main(String[] args) {
        Polymorphism po = new Polymorphism(20);
        Polymorphism po1 = new Polymorphism(20,30,10);
        System.out.println(po.str+ " "+po.cost);

    }
}
