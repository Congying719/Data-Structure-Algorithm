package array;

public class GasStation {

    public static void main(String[] args) {
        GasStation solution = new GasStation();
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        int result = solution.canCompleteCircuit(gas, cost);
        System.out.println(result); // Output: 3
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0;
        int currentGas = 0;
        int startStation = 0;

        for (int i = 0; i < n; i++) {
            totalGas += gas[i] - cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                currentGas = 0;
                startStation = i + 1;
            }
        }

        if (totalGas >= 0) {
            return startStation;
        } else {
            return -1;
        }
    }
}
