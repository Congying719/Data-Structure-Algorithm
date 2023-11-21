package hashTable;

import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacter1002 {

    public static void main(String[] args) {

        String[] strings = {"hello", "ello", "lheo"};
        List<String> list = findCommonString(strings);
        for(String s : list) {
            System.out.print(s + " "); //e l o
        }

    }

    public static List<String> findCommonString(String[] strings) {
        List<String> list = new ArrayList<>();
        if (strings.length == 0) {
            return list;
        }
        int[] number = new int[26];
        for (char c: strings[0].toCharArray()) {
            number[c-'a'] += 1;
        }

        for (int i = 1; i < strings.length;i++) {
            int[] temp = new int[26];
            for (char c : strings[i].toCharArray()) {
                temp[c-'a'] += 1;
            }
            for (int j = 0; j < 26; j++) {
                number[j] = Math.min(number[j], temp[j]);
            }
        }
        for (int i = 0; i < 26;i++) {
            int temp = number[i];
            while (number[i] != 0) {
                list.add(String.valueOf((char)(i+'a')));
                number[i]--;
            }
        }
        return list;
    }
}
