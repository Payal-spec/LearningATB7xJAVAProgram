package Dec.ex_08122024_Wrapper.ex_22122024;

public class Lab133 {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println("You fool");
        }
        System.out.println("start program");
        System.out.println(a);
        System.out.println("end program");
    }
}
