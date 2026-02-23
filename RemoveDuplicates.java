public class RemoveDuplicates {
    public static int findDuplicates(int[] arr) {
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[index] != arr[i]) {
                arr[++index] = arr[i];
            }
        }
        return index+1;

    }

    public static void main(String[] args) {
        int[] arr = { 0,1,1,1,1, 1, 1, 2, 3, 4, 4, 5, 6, 6 };
        int index = findDuplicates(arr);
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
        // for (int i = 0; i < arr.length - 1; i++) {
        // // System.out.println(arr[i]);
        // if (arr[i] == arr[i + 1]) {
        // arr[i] = 0;
        // }
        // }

        // int i = 0;
        // int j = 1;
        // while (i < arr.length && j < arr.length) {
        // if (arr[i] == 0 && arr[j] != 0) {
        // int t = arr[i];
        // arr[i] = arr[j];
        // arr[j] = t;
        // } else if (arr[i] != 0)
        // i++;
        // else
        // j++;
        // }
        // for (int k : arr) {
        // System.out.print(k + " ");
        // }
        // }

    }
}