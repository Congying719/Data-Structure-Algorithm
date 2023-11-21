package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DailyTemperatureLC739 {

    public static void main(String[] args) {
        int[] temps = { 73, 74, 75, 71, 69, 72, 76, 73};
        //output  [1, 1, 4, 2, 1, 1, 0, 0]
        int[] res =  getHighTemList(temps);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] getHighTemList(int[] temps) {

        Stack<Integer> stack = new Stack();
        int[] res = new int[temps.length];
        stack.push(0);
        //73, 74, 75, 71, 69, 72, 76, 73
        for (int i = 1; i < temps.length; i++) {
            if (stack.isEmpty() || temps[i] <= temps[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && temps[i] > temps[stack.peek()]) {
                    res[stack.peek()] = i-stack.peek();
                    stack.pop();
                }
                stack.push(i);
            }
        }
        while (!stack.isEmpty() ) {
            res[stack.pop()] = 0;
        }

        return res;
    }

}
