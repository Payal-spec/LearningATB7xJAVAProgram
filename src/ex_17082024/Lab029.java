package ex_17082024;

public class Lab029 {
    public static void main(String[] args) {
        String password= "PASS";
        String username= password.toLowerCase();
        System.out.println(username);
        System.out.println(password==username);
        System.out.println(password.equalsIgnoreCase(username));
    }
}
