package ex_05112024_encapsulation;

public class Lab110 {
    public static void main(String[] args) {
        SBIBank B1= new SBIBank("Anita",200);
        //B1.setBalance(500);
        //System.out.println(B1.getBalance());
        SBIBank B2= new SBIBank("Amit",100);
        B2.setBalance(200,false);
        B2.getBalance();
        System.out.println(B2.getName());
        System.out.println(B2.getBalance());
        SBIBank B3= new SBIBank("Poo",10);
        B3.setBalance(2000,true);
        B3.getBalance();
        System.out.println(B3.getName());
        System.out.println(B3.getBalance());


    }
}
