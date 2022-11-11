package Abstractuion;

public abstract class Bank {

    //Partial abstraction
    //hiding the implementation logic--is called abstraction
    //abstract class can have abstract method and non-abstract methods
    public abstract void loan(); //abstract method--no method body only method declaration
    public abstract void purchase();


    //NOM-ABSTRACT METHODS
    public void credit(){
        System.out.println("Bank--credit");
    }
    public void debit(){
        System.out.println("Bank--debit");
    }
    public void funds(){
        System.out.println("HDFC--Funds");
    }
}
