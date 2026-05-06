import java.math.*;
public class Sqrt {
 public static int Solution(int x) {
        // Handle small numbers directly
        if (x < 2) return x;

        // Initialize binary search range
        int left = 1, right = x / 2, ans = 0;

        // Perform binary search
        while (left <= right) {
            // Find middle point
            long mid = left + (right - left) / 2;

            // Check if mid*mid is less than or equal to x
            if (mid * mid <= x) {
                // Store mid as potential answer
                ans = (int) mid;
                // Move to right half
                left = (int) mid + 1;
            } else {
                // Move to left half
                right = (int) mid - 1;
            }
        }
         return ans;
    }
    public static void main(String[] args) {
        int n = 34;
        System.out.println(Math.pow(n, 3));
        System.out.println(Math.sqrt(n));
        System.out.println(Solution(n));
    }
}
