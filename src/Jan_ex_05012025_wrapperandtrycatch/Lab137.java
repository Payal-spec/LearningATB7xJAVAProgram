package Jan_ex_05012025_wrapperandtrycatch;

public class Lab137 {
    public static void main(String[] args) {

        int a = 0;
        try {
            a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Something went wrong--" + e);
        }
        System.out.println("End");


    }
}







