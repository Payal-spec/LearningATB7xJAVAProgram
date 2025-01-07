package Jan_ex_05012025_wrapperandtrycatch.ex_07012025;

import javax.swing.*;
import java.util.ArrayList;

public class Lab146 {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        mylist.add("Cat");
        mylist.add("Bat");
        mylist.add("123");
        mylist.add("Bat");
        mylist.add("Mat");
        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.remove("Bat");
        System.out.println(mylist);
        //mylist.clear();
        //System.out.println(mylist);
        System.out.println(mylist.isEmpty() );
        mylist.set(1,"Fat");
        System.out.println(mylist);
        for (Object o : mylist){
            System.out.println(o);
        }
    }
}
