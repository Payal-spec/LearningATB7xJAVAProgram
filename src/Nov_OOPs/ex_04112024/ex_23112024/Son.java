package Nov_OOPs.ex_04112024.ex_23112024;

public class Son implements Father,Mother{
    void receive(){
        money();
        home();
    }
    @Override
    public void money() {
        System.out.println("Son will have money");
    }

    @Override
    public void home() {
        System.out.println("daughter will have home");

    }
}
