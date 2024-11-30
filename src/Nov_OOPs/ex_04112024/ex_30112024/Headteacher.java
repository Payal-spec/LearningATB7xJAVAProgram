package Nov_OOPs.ex_04112024.ex_30112024;

public class Headteacher extends Highschool implements School,Prischool{
    @Override
    public void teacher(String name) {
        System.out.println("eligible for teaching--should be B.ed");
    }

    @Override
    public void teacher() {
        System.out.println("eligible for teaching--should be masters");

    }

    @Override
    public void student() {
        System.out.println("eligible for learning--should be inquisitive");
    }
}
