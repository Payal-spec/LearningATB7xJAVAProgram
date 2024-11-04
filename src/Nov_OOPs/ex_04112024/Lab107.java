package Nov_OOPs.ex_04112024;

public class Lab107 {
    public static void main(String[] args) {
        Login L = new Login("Poozoo","1234");
        //L.password = "111";
        System.out.println(L.password);
    }

}

class Login{
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    String username;
    String password;
}