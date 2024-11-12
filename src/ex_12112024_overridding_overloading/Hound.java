package ex_12112024_overridding_overloading;

public class Hound extends Dog {

    @Override
    void bark(){
        System.out.println("Hound will bark");
    }

    public static void main(String[] args) {
        Dog D1= new Dog();
        D1.bark();

        Hound H1= new Hound();
        H1.bark();

        Dog D2= new Hound();
        D2.bark();
    }
}
