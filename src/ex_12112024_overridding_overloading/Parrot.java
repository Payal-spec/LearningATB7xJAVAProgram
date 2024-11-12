package ex_12112024_overridding_overloading;

public class Parrot extends Sparrow {

    @Override
    void Chirp() {
        System.out.println("Parrot will shout");
    }

    void sing() {
        System.out.println("Singing");
    }
}
