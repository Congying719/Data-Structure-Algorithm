package utils;

import java.util.HashSet;

public class setUtils {

    public void setToArray () {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        // change set to array
        int[] re= set.stream().mapToInt(x -> x).toArray();
        int[] multiple = set.stream().mapToInt(x->x*x).toArray();
        for (int i : multiple) {
            System.out.println(i);
        }
    }
}
