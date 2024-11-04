package Nov_OOPs.ex_04112024;

public class ICICIbank {
   private String Name;
    private Long Balance;

    public ICICIbank(String name, Long balance) {
        Name = name;
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name, Boolean admin) {
        if (admin){

            name=Name;
            System.out.println("Allowed");
        }else {
            System.out.println("Not allowed");
        }

    }

    public Long getBalance() {
        return Balance;
    }

    public void setBalance(Long balance,Boolean admin){
if(admin){
    balance = Balance;
    System.out.println("You are allowed");
}else{
    balance = Balance;
    System.out.println("not Allowed");
}
    }
}
