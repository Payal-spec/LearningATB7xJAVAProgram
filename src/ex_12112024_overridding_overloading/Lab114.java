package ex_12112024_overridding_overloading;

public class Lab114 {
    public static void main(String[] args) {
        Sparrow s= new Sparrow();
        s.Chirp();

        Parrot P= new Parrot();
        P.Chirp();

        Sparrow S1= new Parrot();
        S1.Chirp();



    }
}
