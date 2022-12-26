package Abstractuion;

public class HDFCBank extends Bank{

    @Override
    public void loan() {
        System.out.println("HDFC--Loan Method");
    }
    @Override
    public void purchase() {
        System.out.println("purchase");
    }
    public void withdraw(){
        System.out.println("HDFC--Withdraw");
    }
}
