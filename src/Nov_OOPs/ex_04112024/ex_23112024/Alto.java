package Nov_OOPs.ex_04112024.ex_23112024;

public class Alto implements Engine{
    void drive(){
        startengine();
        stopengine();
    }

    @Override
    public void startengine() {
        System.out.println("starting Alto");
    }

    @Override
    public void stopengine() {
        System.out.println("stopping Alto");
    }
}
