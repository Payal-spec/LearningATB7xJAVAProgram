package ex_05112024_encapsulation;

public class SBIBank {
    private String Name;
    private int Balance;

    public SBIBank(String name, int balance) {
        Name = name;
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance, Boolean admin) {

        if (admin) {
            Balance = balance;
            System.out.println("Allowed");
        } else {
            Balance = balance;
            System.out.println("Not allowed");
        }
    }
}
