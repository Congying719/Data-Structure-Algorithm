package stack;
import java.util.Deque;
import java.util.LinkedList;



/**
 * remove-all-adjacent-duplicates-in-string
 * use three ways:
 * stack
 * stringbuffer
 * two pointer
 */
public class RemoveAadjacentDuplicatesInString {

    public static void main(String[] args) {
        System.out.println(RemoveDuplicatedCharStack("ahhabdd")); // b
        System.out.println(RemoveDuplicatedCharStack("abbaca")); // ac

        System.out.println(RemoveDuplicatedCharStringBuffer("ahhabdd")); // b
        System.out.println(RemoveDuplicatedCharStringBuffer("abbaca")); // ac

        System.out.println(RemoveDuplicatedCharTwoPointer("ahhabdd")); // b
        System.out.println(RemoveDuplicatedCharTwoPointer("abbaca")); // ac

    }

    public static String RemoveDuplicatedCharStack(String original) {

        String result = "";
        Deque<Character> deque = new LinkedList<>();
        for(char c : original.toCharArray()) {
            if (deque.isEmpty() || deque.peek() != c) {
                deque.push(c);
            } else {
                deque.pop();
            }
        }
        while (!deque.isEmpty()) {
            String temp  = String.valueOf(deque.pop());
            result = result + temp;

        }
        return result;
    }

    public static String RemoveDuplicatedCharStringBuffer(String original) {
        int size = -1;
        StringBuffer sb = new StringBuffer();
        for (char c : original.toCharArray()) {
            if (size < 0 || sb.charAt(size) != c) {
                sb.append(c);
                size++;
            } else {
                sb.deleteCharAt(size--);
            }
        }
        return sb.toString();
    }

    public static String RemoveDuplicatedCharTwoPointer(String original) {

        int slow = 0;
        int fast = 0;
        char[] arrays = original.toCharArray();
        for (char c : arrays) {
            arrays[slow] = arrays[fast];
            fast++;
            if (slow == 0 || arrays[slow] != arrays[slow - 1]) {
                slow++;
            } else {
                slow--;
            }
        }

        return new String(arrays,0,slow);
    }

}
