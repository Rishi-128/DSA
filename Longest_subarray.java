
public class Longest_subarray {
    public static int subarray(int[] arr, int n, int k) {
        int maxlen = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right < arr.length) {
            sum += arr[right];
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
            right++;
        }

        return maxlen;
    }

    public static void main(String[] args) {
        int sum = 6;
        int[] a = { 1, 3, 2, 1, 1, 1, 1, 6, 7, 5, 1 };
        int n = a.length;
        int maxlen = subarray(a, n, sum);
        System.out.print(maxlen);

    }
}
