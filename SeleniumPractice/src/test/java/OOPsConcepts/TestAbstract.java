package OOPsConcepts;

public class TestAbstract {
    public static void main(String[] args) {
        ExtendAbstract ex = new ExtendAbstract();
        ex.username();
        ex.password();

        Abstraction ab = new ExtendAbstract();
        ab.username();
        ab.password();
        ab.credit();
        ab.debit();
        ab.loan();
    }

}
