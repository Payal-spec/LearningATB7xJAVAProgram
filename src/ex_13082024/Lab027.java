package ex_13082024;

public class Lab027 {
    public static void main(String[] args) {
        String password= "LotusSS";
        String Username= password.toLowerCase();
        System.out.println(password.equals(Username));
        System.out.println(password.equalsIgnoreCase(Username));
    }
}
