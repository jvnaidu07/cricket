package OOPsConcepts;

public abstract class Abstraction {
    //abstract method-- no-method body--only method declaration
    public abstract void username();
    public abstract  void password();

    public void credit(){
        System.out.println("credit");
    }
    public void debit(){
        System.out.println("debit");
    }
    public void loan(){
        System.out.println("loan");
    }
}
