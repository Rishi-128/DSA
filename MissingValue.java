public class MissingValue {

    public static int optimal_1(int[] arr, int n) {
        // TC -> O(n)
        // SC-> O(1)
        int i = 0, j = n;
        int k = (n % 2 == 0) ? 2 : 1;
        while (i < j) {
            if (i + 1 != arr[i])
                return i + 1;
            else if (j != arr[j - k]) {
                return j;
            } else {
                i++;
                j--;
            }
        }

        return 0;
    }

    public static int optimal_2(int[] arr, int n) {
        // TC -> O(n)
        // SC-> O(1)
        for (int i = 0; i <= n; i++) {
            // System.out.println(i);
            // System.out.println(arr[i]);
            if (i + 1 != arr[i]) {
                // System.out.print(i+1);
                return i + 1;
            }
        }
        return 0;
    }

    public static int brute_force(int[] arr, int n) {

        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (i == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                return i;
        }
        return 0;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int sol = brute_force(arr, n);
        // int sol = optimal_1(arr, n);
        // int sol = optimal_2(arr, n);
        if (sol == 0) {
            System.out.println("Array does not contain any missing value");
        } else {
            System.out.println(sol);
        }
    }

}
