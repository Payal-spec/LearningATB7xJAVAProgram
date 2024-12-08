package Dec.ex_08122024_Wrapper;

public class Lab130 {
    public static void main(String[] args) {
        Automation A = new Automation();
    }
}
class Automation{

    static{
        System.out.println("Loaded data from mySQL");
    }
    static {
        System.out.println("Loaded data from CSV file");
    }
}