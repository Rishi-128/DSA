public class MoveZerors {
    public static void move_zero_brute_force(int[] arr, int n) {
        // TC -> O(N) + O(X) + O(N-X) = O(2N)
        // SC -> O(N)
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j++] = arr[i];
            }
        }
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void move_zero_better(int[] arr, int n) {
        // TC -> O(N)
        // SC -> O(1)
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void move_zero_optimal(int[] arr, int n) {
        // TC -> O(N)
        // SC -> O(1)
        int first = 0;
        int last = n - 1;
        while (first < last) {
            if (arr[first] != 0) {
                first++;
            }
            if (arr[last] == 0) {
                last--;
            } else if (arr[first] == 0 && arr[last] != 0) {
                int t = arr[first];
                arr[first] = arr[last];
                arr[last] = t;
                first++;
                last--;
            }

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0, 0, 1 };
        int n = arr.length;
        // move_zero_optimal(arr, n);
        // move_zero_optimal(arr, n);
        // move_zero_better(arr, n);
        move_zero_brute_force(arr, n);

    }
}
