package Jan_ex_05012025_wrapperandtrycatch.ex_07012025;

import java.util.ArrayList;
import java.util.List;

public class Lab143 {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        mylist.add ("Apple");
        mylist.add("milk");
        mylist.add("bread");
        mylist.add("butter");
        System.out.println(mylist);
        System.out.println(mylist.size());
        System.out.println(mylist.contains("milk"));
        System.out.println(mylist.contains("tea"));
        String s = (String) mylist.get(2);
        System.out.println(s                );
    }
}
