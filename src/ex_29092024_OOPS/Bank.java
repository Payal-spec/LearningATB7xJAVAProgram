package ex_29092024_OOPS;

public class Bank {
    String bankname;
    int bankacc;
    String bankcode;

    Bank() {
        bankname = "SBI";
        bankacc = 123;
        bankcode = "sbi123";
    }

    Bank(String name, int account, String code){
        this.bankname =name;
        this.bankacc= account;
        this.bankcode= code;
    }
    void printdetails(){
        System.out.println("Bank name->" +bankname);
        System.out.println("Bank account->"+ bankacc);
        System.out.println("Bank code->" + bankcode);
    }
}
