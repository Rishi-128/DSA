public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {3,7,7,8,8,9};
        int target = 8;

        int[] result = {-1, -1};

        result[0] = findFirst(arr, target);
        result[1] = findLast(arr, target);

        System.out.println(result[0] + " " + result[1]);
    }

    static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1; // move left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1; // move right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}