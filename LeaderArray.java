import java.util.ArrayList;

public class LeaderArray {
    public static void main(String[] args) {
        int[] arr = { -3, 4, 5, 1, -4, -5 };
        int n = arr.length;
        int max = arr[n - 1];
        int max1 = Integer.MAX_VALUE;
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] <= max) {
                continue;
            } else if (arr[i] > max && arr[i] < max1) {
                a.add(arr[i]);
                max1 = arr[i];
            } else if (arr[i] > max && arr[i] > max) {
                a.remove(a.size() - 1);
                a.add(arr[i]);
                max1 = arr[i];
            }
        }
        a.add(arr[n - 1]);
        System.out.print(a);
    }
}
