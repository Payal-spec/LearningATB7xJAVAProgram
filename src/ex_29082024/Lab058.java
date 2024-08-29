package ex_29082024;

public class Lab058 {
    public static void main(String[] args) {
        int code = 005;
        switch (code){
            case 001,002,003:
                System.out.println("It is mechanical");
                break;
            case 004,005,006:
                System.out.println("It is chemical");
                break;
            default:
                System.out.println("It is electrical");
        }
    }
}
