import java.util.*;

class Solution {
    // Function to calculate total hours for given speed
    public int calculateTotalHours(int[] a, int hourly) {
        int totalHours = 0;
        for (int pile : a) {
            // Add hours using ceil
            totalHours += (int)Math.ceil((double)pile / hourly);
        }
        return totalHours;
    }

    // Function to find minimum eating speed
    public int minEatingSpeed(int[] a, int h) {
        // Find maximum pile size
        int maxVal = Arrays.stream(a).max().getAsInt();

        // Try every possible speed
        for (int i = 1; i <= maxVal; i++) {
            int hours = calculateTotalHours(a, i);

            // If hours fit within h
            if (hours <= h) {
                return i;
            }
        }
        return maxVal;
    }
}

public class KokoBanana {
    public static void main(String[] args) {
        // Input array
        int[] a = {3, 6, 7, 16};
        // Hours allowed
        int h = 8;

        Solution obj = new Solution();
        System.out.println(obj.minEatingSpeed(a, h));
    }
}
