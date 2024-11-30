package Nov_OOPs.ex_04112024.ex_30112024;

public class student extends Highschool implements School,Prischool{
    @Override
    public void teacher(String name) {
        System.out.println("eligible for teaching--should be ex-student");

    }

    @Override
    public void fame() {
        Prischool.super.fame();
    }

    @Override
    public void teacher() {
        System.out.println("eligible for teaching--should be skilled");

    }

    @Override
    public void student() {
        System.out.println("eligible for learning--should enroll");

    }
}
