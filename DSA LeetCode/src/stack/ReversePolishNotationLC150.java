package stack;

import java.util.Deque;
import java.util.LinkedList;

//reverse-polish-notation
public class ReversePolishNotationLC150 {


    public static void main(String[] args) {
        String[] array1 = {"2", "1", "+", "3", "*"};
        System.out.println(reversePolishNotation(array1)); //9

        String[] array2 = {"10", "6", "9", "3", "+", "-11", " * ", "/", " * ", "17", "+", "5", "+"};
        System.out.println(reversePolishNotation(array2)); //22
    }

    /**
     * input: ["2", "1", "+", "3", " * "]
     * output: 9
     * explanation: the array can swith to ((2 + 1) * 3) = 9
     * input:["10", "6", "9", "3", "+", "-11", " * ", "/", "*", "17", "+", "5", "+"]
     * output: 22
     * explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
     * @param arrays contains numbers and algorithm operator
     * @return
     */
    public static int reversePolishNotation(String[] arrays) {

        Deque<Integer> deque = new LinkedList<>();
        int temp = 0;
        for (String s : arrays) {
            switch (s.replaceAll(" ","")) {
                case "+":
                    temp = deque.pop() + deque.pop();
                    deque.push(temp);
                    break;
                case "-":
                    temp = -deque.pop() + deque.pop();
                    deque.push(temp);
                    break;
                case "*":
                    temp = deque.pop() * deque.pop();
                    deque.push(temp);
                    break;
                case "/":
                    int index1 = deque.pop();
                    int index2 = deque.pop();
                    temp = index2/index1;
                    deque.push(temp);
                    break;
                default:
                    deque.push(Integer.parseInt(s));

            }
        }

        return deque.pop();
    }


}
