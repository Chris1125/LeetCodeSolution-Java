package Q0100_0199.Q0134;

/**
 * @author Chris
 * @description
 * @since 2020-11-18
 */
public class Solution1 {

    public static void main(String[] args) {
//        int[] gas = new int[]{1, 2, 3, 4, 5};
//        int[] cost = new int[]{3, 4, 5, 1, 2};
        int[] gas = new int[]{5, 1, 2, 3, 4};
        int[] cost = new int[]{4, 4, 1, 5, 1};

        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas = 0;
        int sumCost = 0;
        int total = gas.length;
        int i = 0;
        int temp = 0;
        int start = 0;
        while (i < total) {
            sumGas += gas[i];
            sumCost += cost[i];

            temp += gas[i] - cost[i];
            if (temp < 0) {
                start = i + 1;
                temp = 0;
            }

            i++;
        }

        if (sumCost > sumGas) {
            return -1;
        }

        return start;
    }

}
