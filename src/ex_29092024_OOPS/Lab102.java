package ex_29092024_OOPS;

public class Lab102 {
    public static void main(String[] args) {
        Bank b1= new Bank();
        System.out.println(b1.bankname);
        System.out.println(b1.bankacc);
        System.out.println(b1.bankcode);
Bank b2 =new Bank("icici",345,"icici345");
       b2.printdetails();
       Bank b3 =new Bank("hdfc", 77, "hdfc77");
       b3.printdetails();
    }


}
