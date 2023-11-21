package dynamicProgramming;

/**
 * writing to understand what is Fibonacci
 * other questions will use the concept
 */
public class FibonacciLC509 {

    public static void main(String[] args) {
        int[] array7 = generateFibonacci(7,1,2);
        for (int i : array7) {
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.println(getFibonacciN(7,1,2));
    }

    public static int[] generateFibonacci(int N, int first, int second) {

        int[] res = new int[N];
        res[0] = first;
        res[1] = second;
        for (int i = 2; i < N;i++) {
            res[i] = res[i-1] + res[i-2];
        }
        return res;
    }

    public static int getFibonacciN(int N, int first, int second) {
        int result = 0;
        if (N == 0) {
            return first;
        }
        if (N == 1) {
            return second;
        }
        for (int i = 2; i < N; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }


}
