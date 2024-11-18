package Nov_OOPs.ex_04112024.ex_18112024;

public class Lab120 {
    public static void main(String[] args) {
        Chrome C = new Chrome();
        C.Openbrowser();
        C.Closebrowser();
        C.Takescreenshots();
        System.out.println("______________");
        Firefox F = new Firefox();
        F.Openbrowser();
        F.Closebrowser();
        F.Takescreenshots();
    }
}
