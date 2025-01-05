package Jan_ex_05012025_wrapperandtrycatch;

public class Lab138 {
    public static void main(String[] args) {
        Bank sbi = new Bank(100, "INR");
        Bank icici = new Bank(200, "INR");
        Bank hdfc = new Bank(150, "USD");
        Integer total= sbi.add(hdfc);
        System.out.println(total);
    }
}
