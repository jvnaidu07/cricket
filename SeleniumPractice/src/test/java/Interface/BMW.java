package Interface;

public class BMW implements Car{
    @Override
    public void start() {
        System.out.println("start-BMW");
    }
    @Override
    public void stop() {
        System.out.println("stop BMW");
    }
    @Override
    public void refuel() {
        System.out.println("refuel-BMW");
    }
    @Override
    public void go() {
    }
    //non-overridden methods
    public  void theftsafety(){
        System.out.println("theft safety");

    }
}
