public class BuySellStock {

    // TC-> O(N^2) SC-> O(1)
    public static int brute(int[] arr, int n) {
        int profit = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            profit = 0;
            for (int j = i; j < n; j++) {
                profit = arr[j] - arr[i];
                if (profit > max)
                    max = profit;
            }
        }
        return max;
    }

    // TC-> O(N) SC-> O(1)
    public static int optimal(int[] arr, int n) {
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int cost = arr[i] - min;
            max = Math.max(max, cost);
            min = Math.min(min, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 1, 4, 6, 2 };
        int n = arr.length;
        // int max = brute(arr, n);

        int max = optimal(arr, n);
        System.out.print(max);
    }
}
