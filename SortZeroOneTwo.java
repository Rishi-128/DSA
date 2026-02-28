public class SortZeroOneTwo {
    public static void optimal(int[] arr, int n) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else
                count2++;
        }

        for (int i = 0; i < n; i++) {
            if (i < count0)
                arr[i] = 0;
            else if (i < (count0 + count1))
                arr[i] = 1;
            else
                arr[i] = 2;
        }
        System.out.println(count0);
        System.out.println(count1);
        System.out.println(count2);

        for (int i : arr) {
            System.out.print(i);
        }
    }

    public static void optimal_1(int[] arr, int n) {
        int i = 0;
        int k = 0;
        int count0 = 0, count1 = 0, count2 = 0;
        while (k < n) {
            if (i < n) {
                if (arr[i] == 0) {
                    count0++;
                } else if (arr[i] == 1) {
                    count1++;
                } else
                    count2++;
                i++;
            }

            else {
                if (k < count0)
                    arr[k] = 0;
                else if (k < (count0 + count1))
                    arr[k] = 1;
                else
                    arr[k] = 2;
                k++;
            }
        }
        for (int w : arr) {
            System.out.print(w);
        }
    }

    public static void most_optimal(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid < high) {
            if (arr[mid] == 0) {
                int t = arr[mid];
                arr[mid] = arr[low];
                arr[low] = t;
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int t = arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;
                // mid++;
                high--;
            }
        }
        for (int w : arr) {
            System.out.print(w + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 1, 0, 2, 1, 0, 2, 2, 0, 1 };
        int n = arr.length;
        // optimal(arr, n);
        // optimal_1(arr, n);
        most_optimal(arr, n);
    }
}
