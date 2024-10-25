package ex_25102024_HasA;

public class Mother {
    void child(){
        new Daughter().D();
        new Son().S();
    }

    public static void main(String[] args) {
        new Mother().child();
    }
}
