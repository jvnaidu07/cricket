package OOPsConcepts;

public class ParentClass{
    String laptop;
    String charger;
    String bag;
    String bottle;

    ParentClass(){
        laptop = "new";
        charger = "lenovo";
        bag = "tokyo";
        bottle = "kisko";
    }

    void laptop(){
        System.out.println(laptop);
        System.out.println(charger);
        System.out.println(bag);
        System.out.println(bottle);
    }
    void charger(){
        System.out.println();
    }
    void bag(){
        System.out.println("bag");
    }
    void bottle() {
        System.out.println("bottle");
    }
    void mousecost(int i, int j, int k) {
        System.out.println("bottle");
    }

    public static void main(String[] args) {
        ParentClass pc = new ParentClass();
        pc.laptop = "lenovo";
        pc.bag = "tokyo";
        pc.charger= "lenovo";
        pc.laptop();

    }
}
