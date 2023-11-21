package dynamicProgramming;

public class ClimbStairsLC70 {
    public static void main(String[] args) {

        /**
         * to first stair, only one way
         * to second stair, two way
         * to third stair, can think as come from second floor in 1 step or from first floor with 2 step.
         * so third is first + second
         * forth is third + second
         */
        int first = 1;
        int second = 2;

        System.out.println(FibonacciLC509.getFibonacciN(10, first,second));


    }
}
