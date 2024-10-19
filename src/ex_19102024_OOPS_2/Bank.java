package ex_19102024_OOPS_2;

public class Bank {
    String Bname;
    int Bbal;
    String Bcode;

    Bank(){
        Bname="SBI";
        Bbal = 0;
        Bcode= "SBI1";
    }

    Bank(String Bankn, int Bankb, String Bankc){
        this.Bname = Bankn;
        this.Bbal = Bankb;
        this.Bcode = Bankc;
    }

    void printdetails(){
        System.out.println("Your Bank name is>" + Bname);
        System.out.println("Your Bank balance is>" + Bbal);
        System.out.println("Your Bank code is>" + Bcode);
    }
}
