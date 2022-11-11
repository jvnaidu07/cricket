package OOPsConcepts;

public class ChildClass extends ParentClass{
    ChildClass(String laptop, String charger, String bag, String bottle) {
        super();
    }

    public static void main(String[] args) {
        ParentClass pc = new ParentClass();
        pc.laptop();
        pc.charger();
        pc.bag();
    }

    void car() {

    }

}
