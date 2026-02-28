public class MaxSubarray {
    public static int better(int[] arr, int n) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > max)
                    max = sum;
            }

        }
        return max;
    }

    // KADANE's ALGO
    // TC-> O(n) , SC-> O(1)
    public static int optimal(int[] arr, int n) {
        int max = Integer.MIN_VALUE;
        int ptr = 0;
        int sum = 0;
        int i = 0;
        int j = 0;
        while (ptr < n) {
            sum += arr[ptr];
            if (sum > max) {
                max = sum;
                j = ptr;
            }
            if (sum < 0) {
                sum = 0;
                i = ptr + 1;
            }
            ptr++;

        }
        System.out.print(i + " " + j + "\n");
        for (int k = i; k <= j; k++) {
            System.out.print(arr[k] + " ");
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 2, -2, -1, 4, -1, 5, 0, 1, -2 };
        int n = arr.length;
        // int max = better(arr, n);
        int max = optimal(arr, n);
        System.out.println(max);
    }
}
