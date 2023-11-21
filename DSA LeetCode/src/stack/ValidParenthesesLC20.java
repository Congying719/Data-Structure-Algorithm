package stack;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParenthesesLC20 {

    public static void main(String[] args) {

        boolean valid = validParentheses("({}[])");
        System.out.println(valid);
    }

    public static boolean validParentheses(String parenthese) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : parenthese.toCharArray()) {
            if (c == '(') {
                deque.push(')');
            } else if ( c == '['  ) {
                deque.push(']');
            } else if (c == '{' ) {
                deque.push('}');
            }  else {
                if (deque.peek() == null) {
                    return false;
                }
                if (deque.peek() == c) {
                    deque.pop();
                }
            }
        }
        return true;
    }
}
