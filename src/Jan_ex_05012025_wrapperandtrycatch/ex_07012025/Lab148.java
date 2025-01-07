package Jan_ex_05012025_wrapperandtrycatch.ex_07012025;

import java.util.*;

public class Lab148 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList();
        marks.add(76);
        marks.add(66);
        marks.add(74);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(marks.reversed());
        System.out.println(marks);
    }}
