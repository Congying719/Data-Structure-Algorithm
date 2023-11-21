package hashTable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class IntersectionTwoArrayLC349 {

    public static void main(String[] args) {
        int[] i1 = {1, 2, 3, 9 , 4, 5};
        int[] i2 = {4, 3, 2, 5, 7};

        for(int i : intersection(i1,i2)){
            System.out.print(i + " "); // 2 3 4 5
        }
    }

    public static List<Integer> intersection(int[] int1, int[] int2) {

        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for (int i : int1) {
            set.add(i);
        }
        for (int i : int2) {
            if (set.contains(i)) {
                result.add(i);
            }
        }

        Iterator<Integer> iterator= result.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }



}
