package Jan_ex_05012025_wrapperandtrycatch.ex_07012025;

import java.util.ArrayList;

public class Lab144 {
    public static void main(String[] args) {
        ArrayList alist = new ArrayList();
        alist.add("snacks");
        alist.add(123);
        alist.add("true");
        alist.add("friends");
        String s = (String) alist.get(2);
        System.out.println(s);
    }
}
