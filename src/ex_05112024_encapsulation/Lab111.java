package ex_05112024_encapsulation;

public class Lab111 {
    public static void main(String[] args) {
        Login L1= new Login("POozoo","Poo123");
        L1.setUsername("Poooz");
        System.out.println(L1.getUsername());
        System.out.println(L1.getPassword());
    }
}
