package Abstractuion;

public class TestBank {
    public static void main(String[] args) {
        HDFCBank hb=new HDFCBank();
        hb.credit();
        hb.debit();
        hb.loan();
        hb.funds();
        hb.withdraw();

        Bank b=new HDFCBank();
        b.credit();
        b.loan();
        b.debit();
        b.funds();


    }
}
