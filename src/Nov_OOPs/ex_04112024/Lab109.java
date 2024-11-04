package Nov_OOPs.ex_04112024;

public class Lab109 {
    public static void main(String[] args) {
        ICICIbank B = new ICICIbank("LOO",200l);
   B.setBalance(25000l,false);
    ICICIbank B1 = new ICICIbank("Poo",340000l);
    B1.setBalance(5000l,true);
        System.out.println(B1.getBalance());


    }
}
